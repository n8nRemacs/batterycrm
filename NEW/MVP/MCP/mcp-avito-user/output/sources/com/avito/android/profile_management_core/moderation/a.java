package com.avito.android.profile_management_core.moderation;

import Y61.k;
import Y61.l;
import com.avito.android.profile_management_core.moderation.ModerationStatus;
import com.avito.android.remote.model.basic.Field;
import com.avito.android.remote.model.extended.FieldModerationStatus;
import com.avito.android.remote.model.extended.modification.ModificationResult;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ModerationStatus.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito-discouraged_avito-libs_profile-management-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a {

    /* compiled from: ModerationStatus.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.profile_management_core.moderation.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C6884a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f226781a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f226782b;

        static {
            int[] iArr = new int[FieldModerationStatus.StatusName.values().length];
            try {
                iArr[FieldModerationStatus.StatusName.MODERATION_PENDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FieldModerationStatus.StatusName.REJECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FieldModerationStatus.StatusName.RELEASED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f226781a = iArr;
            int[] iArr2 = new int[Field.StatusType.values().length];
            try {
                iArr2[Field.StatusType.WAITING.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[Field.StatusType.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            f226782b = iArr2;
        }
    }

    @k
    public static final ModerationStatus a(@k FieldModerationStatus fieldModerationStatus) {
        int i12 = C6884a.f226781a[fieldModerationStatus.getName().ordinal()];
        if (i12 == 1) {
            return new ModerationStatus.ModerationPending(fieldModerationStatus.getTitle(), fieldModerationStatus.getSubtitle(), fieldModerationStatus.getName().getRawValue());
        }
        if (i12 == 2) {
            return new ModerationStatus.ModerationFailed(fieldModerationStatus.getTitle(), fieldModerationStatus.getSubtitle(), fieldModerationStatus.getName().getRawValue());
        }
        if (i12 == 3) {
            return new ModerationStatus.ModerationPassed(fieldModerationStatus.getTitle(), fieldModerationStatus.getSubtitle(), fieldModerationStatus.getName().getRawValue());
        }
        throw new NoWhenBranchMatchedException();
    }

    @l
    public static final ModerationStatus b(@k ModificationResult.Ok ok2, @k String str, @k String str2) {
        Object next;
        List<ModificationResult.Ok.Field.FieldValue> values;
        Object next2;
        FieldModerationStatus moderationStatus;
        Iterator<T> it = ok2.getFields().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (L.f(((ModificationResult.Ok.Field) next).getName(), str)) {
                break;
            }
        }
        ModificationResult.Ok.Field field = (ModificationResult.Ok.Field) next;
        if (field == null || (values = field.getValues()) == null) {
            return null;
        }
        Iterator<T> it2 = values.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
            if (L.f(((ModificationResult.Ok.Field.FieldValue) next2).getValueId(), str2)) {
                break;
            }
        }
        ModificationResult.Ok.Field.FieldValue fieldValue = (ModificationResult.Ok.Field.FieldValue) next2;
        if (fieldValue == null || (moderationStatus = fieldValue.getModerationStatus()) == null) {
            return null;
        }
        return a(moderationStatus);
    }

    @k
    public static final Map<String, ModerationStatus> c(@k ModificationResult.Ok ok2, @k String str) {
        Object next;
        List<ModificationResult.Ok.Field.FieldValue> values;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> it = ok2.getFields().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (L.f(((ModificationResult.Ok.Field) next).getName(), str)) {
                break;
            }
        }
        ModificationResult.Ok.Field field = (ModificationResult.Ok.Field) next;
        if (field == null || (values = field.getValues()) == null) {
            return P0.c();
        }
        for (ModificationResult.Ok.Field.FieldValue fieldValue : values) {
            FieldModerationStatus moderationStatus = fieldValue.getModerationStatus();
            if (moderationStatus != null) {
                linkedHashMap.put(fieldValue.getValueId(), a(moderationStatus));
            }
        }
        return linkedHashMap;
    }
}
