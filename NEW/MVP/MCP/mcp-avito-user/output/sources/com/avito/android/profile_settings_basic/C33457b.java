package com.avito.android.profile_settings_basic;

import androidx.compose.runtime.internal.P;
import com.avito.android.profile_settings_basic.adapter.basic_info.BasicInfoItem;
import com.avito.android.profile_settings_basic.mvi.entity.BasicInfoAvatarAction;
import com.avito.android.remote.model.basic.BasicInfoWidgetAvatarAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: AvatarActionsConverter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_settings_basic/b;", "Lcom/avito/android/profile_settings_basic/a;", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.profile_settings_basic.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33457b implements InterfaceC33456a {

    /* compiled from: AvatarActionsConverter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.profile_settings_basic.b$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f228733a;

        static {
            int[] iArr = new int[BasicInfoWidgetAvatarAction.AvatarActionType.values().length];
            try {
                iArr[BasicInfoWidgetAvatarAction.AvatarActionType.UPLOAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BasicInfoWidgetAvatarAction.AvatarActionType.REMOVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f228733a = iArr;
        }
    }

    @Inject
    public C33457b() {
    }

    @Override // com.avito.android.profile_settings_basic.InterfaceC33456a
    @Y61.k
    public final ArrayList a(@Y61.k List list) {
        BasicInfoAvatarAction deleteAvatarImage;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            BasicInfoWidgetAvatarAction basicInfoWidgetAvatarAction = (BasicInfoWidgetAvatarAction) it.next();
            BasicInfoWidgetAvatarAction.AvatarActionType type = basicInfoWidgetAvatarAction.getType();
            int i12 = type == null ? -1 : a.f228733a[type.ordinal()];
            BasicInfoItem.AvatarAction avatarAction = null;
            if (i12 != -1) {
                if (i12 == 1) {
                    deleteAvatarImage = BasicInfoAvatarAction.OpenAvatarPicker.f228876b;
                } else {
                    if (i12 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Boolean boolIsRemovePublic = basicInfoWidgetAvatarAction.isRemovePublic();
                    deleteAvatarImage = new BasicInfoAvatarAction.DeleteAvatarImage(boolIsRemovePublic != null ? boolIsRemovePublic.booleanValue() : true);
                }
            } else {
                deleteAvatarImage = null;
            }
            String title = basicInfoWidgetAvatarAction.getTitle();
            BasicInfoWidgetAvatarAction.AvatarActionIconType icon = basicInfoWidgetAvatarAction.getIcon();
            if (title != null && deleteAvatarImage != null && icon != null) {
                avatarAction = new BasicInfoItem.AvatarAction(title, deleteAvatarImage, icon);
            }
            if (avatarAction != null) {
                arrayList.add(avatarAction);
            }
        }
        return arrayList;
    }
}
