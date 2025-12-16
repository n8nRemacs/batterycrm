package com.avito.android.edit_address.dialog.time_interval;

import Y41.l;
import Y61.k;
import android.content.res.Resources;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.edit_address.dialog.time_interval.TimeIntervalPicker;
import com.avito.android.edit_address.entity.TimeInterval;
import j.k0;
import java.util.Arrays;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: TimeIntervalPickerPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/edit_address/dialog/time_interval/b;", "Lcom/avito/android/edit_address/dialog/time_interval/a;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b implements com.avito.android.edit_address.dialog.time_interval.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Resources f145866a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TimeIntervalPicker.Mode f145867b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final l<TimeInterval, G0> f145868c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f145869d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f145870e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f145871f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final String f145872g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public h f145873h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f145874i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public Integer f145875j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public Integer f145876k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f145877l;

    /* compiled from: TimeIntervalPickerPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[TimeIntervalPicker.Mode.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                TimeIntervalPicker.Mode mode = TimeIntervalPicker.Mode.f145857b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(@k Resources resources, @k TimeIntervalPicker.Mode mode, @Y61.l TimeInterval timeInterval, @k l<? super TimeInterval, G0> lVar) throws Resources.NotFoundException {
        String string;
        String string2;
        this.f145866a = resources;
        this.f145867b = mode;
        this.f145868c = lVar;
        this.f145869d = resources.getString(R.string.interval_picker_since_prefix);
        this.f145870e = resources.getString(R.string.interval_picker_until_prefix);
        int iOrdinal = mode.ordinal();
        if (iOrdinal == 0) {
            string = resources.getString(R.string.interval_picker_title_work);
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            string = resources.getString(R.string.interval_picker_title_break);
        }
        this.f145871f = string;
        int iOrdinal2 = mode.ordinal();
        if (iOrdinal2 == 0) {
            string2 = resources.getString(R.string.interval_picker_error_postfix_work);
        } else {
            if (iOrdinal2 != 1) {
                throw new NoWhenBranchMatchedException();
            }
            string2 = resources.getString(R.string.interval_picker_error_postfix_break);
        }
        this.f145872g = string2;
        this.f145874i = true;
    }

    public static String a(int i12) {
        return String.format((i12 / 60) + ":%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i12 % 60)}, 1));
    }

    @k0
    public final void b(int i12) {
        this.f145876k = Integer.valueOf(i12);
        h hVar = this.f145873h;
        if (hVar != null) {
            hVar.b(this.f145870e + ' ' + a(i12));
        }
        d();
    }

    @k0
    public final void c(int i12) {
        this.f145875j = Integer.valueOf(i12);
        h hVar = this.f145873h;
        if (hVar != null) {
            hVar.d(this.f145869d + ' ' + a(i12));
        }
        d();
    }

    public final void d() {
        String str;
        if (this.f145874i || this.f145877l) {
            return;
        }
        Integer num = this.f145875j;
        String str2 = this.f145872g;
        Resources resources = this.f145866a;
        if (num == null && this.f145876k == null) {
            str = resources.getString(R.string.interval_picker_error) + ' ' + str2;
        } else if (num == null) {
            str = resources.getString(R.string.interval_picker_start_error) + ' ' + str2;
        } else if (this.f145876k == null) {
            str = resources.getString(R.string.interval_picker_end_error) + ' ' + str2;
        } else {
            str = null;
        }
        h hVar = this.f145873h;
        if (hVar != null) {
            hVar.c(str, this.f145875j == null, this.f145876k == null);
        }
    }
}
