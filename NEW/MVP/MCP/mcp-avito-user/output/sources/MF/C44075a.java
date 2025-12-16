package mf;

import Y61.k;
import com.avito.android.auto_select_core.ui.models.AutoSelectButtonStyle;
import com.avito.android.remote.model.auto_select.AutoSelectButtonStyleDto;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: AutoSelectButtonStyle.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_auto-select-core_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: mf.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C44075a {

    /* compiled from: AutoSelectButtonStyle.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mf.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C11834a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f414657a;

        static {
            int[] iArr = new int[AutoSelectButtonStyleDto.values().length];
            try {
                iArr[AutoSelectButtonStyleDto.PRIMARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AutoSelectButtonStyleDto.SECONDARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AutoSelectButtonStyleDto.OVERLAY_PRIMARY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f414657a = iArr;
        }
    }

    @k
    public static final AutoSelectButtonStyle a(@k AutoSelectButtonStyleDto autoSelectButtonStyleDto) {
        int i12 = C11834a.f414657a[autoSelectButtonStyleDto.ordinal()];
        if (i12 == 1) {
            return AutoSelectButtonStyle.f96077c;
        }
        if (i12 == 2) {
            return AutoSelectButtonStyle.f96078d;
        }
        if (i12 == 3) {
            return AutoSelectButtonStyle.f96079e;
        }
        throw new NoWhenBranchMatchedException();
    }
}
