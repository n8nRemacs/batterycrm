package com.avito.android.beduin.common.component.label;

import Y61.k;
import Y61.l;
import android.text.TextUtils;
import com.avito.android.beduin.network.model.TextTruncation;
import com.avito.android.remote.model.Alignment;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: BeduinLabelComponent.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_beduin_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e {

    /* compiled from: BeduinLabelComponent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f101664a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f101665b;

        static {
            int[] iArr = new int[Alignment.values().length];
            try {
                iArr[Alignment.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Alignment.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f101664a = iArr;
            int[] iArr2 = new int[TextTruncation.values().length];
            try {
                iArr2[TextTruncation.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[TextTruncation.MIDDLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[TextTruncation.END.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[TextTruncation.NONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            f101665b = iArr2;
        }
    }

    public static final int a(@k BeduinLabelModel beduinLabelModel) {
        Alignment alignment = beduinLabelModel.getAlignment();
        int i12 = alignment == null ? -1 : a.f101664a[alignment.ordinal()];
        if (i12 != 1) {
            return i12 != 2 ? 8388611 : 8388613;
        }
        return 17;
    }

    @l
    public static final TextUtils.TruncateAt b(@k BeduinLabelModel beduinLabelModel) {
        TextTruncation truncation = beduinLabelModel.getTruncation();
        int i12 = truncation == null ? -1 : a.f101665b[truncation.ordinal()];
        if (i12 != -1) {
            if (i12 == 1) {
                return TextUtils.TruncateAt.START;
            }
            if (i12 == 2) {
                return TextUtils.TruncateAt.MIDDLE;
            }
            if (i12 != 3) {
                if (i12 == 4) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            }
        }
        return TextUtils.TruncateAt.END;
    }
}
