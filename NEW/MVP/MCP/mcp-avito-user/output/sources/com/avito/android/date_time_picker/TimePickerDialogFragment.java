package com.avito.android.date_time_picker;

import Y61.l;
import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.os.C22777e;
import androidx.fragment.app.C22960s;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.date_time_picker.perf_screen.TimePickerDialogScreen;
import com.avito.android.di.C29972i;
import com.avito.android.ui.fragments.BaseDialogFragment;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;

/* compiled from: TimePickerDialogFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/avito/android/date_time_picker/TimePickerDialogFragment;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "Result", "_avito_date-time-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class TimePickerDialogFragment extends BaseDialogFragment implements InterfaceC28477j.b {

    /* renamed from: j0, reason: collision with root package name */
    @Y61.k
    public static final a f132645j0 = new a(null);

    /* renamed from: h0, reason: collision with root package name */
    public TimePickerDialog f132646h0;

    /* renamed from: i0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f132647i0;

    /* compiled from: TimePickerDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/date_time_picker/TimePickerDialogFragment$Result;", "Landroid/os/Parcelable;", "Canceled", "Success", "Lcom/avito/android/date_time_picker/TimePickerDialogFragment$Result$Canceled;", "Lcom/avito/android/date_time_picker/TimePickerDialogFragment$Result$Success;", "_avito_date-time-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Result extends Parcelable {

        /* compiled from: TimePickerDialogFragment.kt */
        @K51.d
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/date_time_picker/TimePickerDialogFragment$Result$Canceled;", "Lcom/avito/android/date_time_picker/TimePickerDialogFragment$Result;", "<init>", "()V", "_avito_date-time-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Canceled implements Result {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final Canceled f132648b = new Canceled();

            @Y61.k
            public static final Parcelable.Creator<Canceled> CREATOR = new a();

            /* compiled from: TimePickerDialogFragment.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Canceled> {
                @Override // android.os.Parcelable.Creator
                public final Canceled createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return Canceled.f132648b;
                }

                @Override // android.os.Parcelable.Creator
                public final Canceled[] newArray(int i12) {
                    return new Canceled[i12];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeInt(1);
            }
        }

        /* compiled from: TimePickerDialogFragment.kt */
        @K51.d
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/date_time_picker/TimePickerDialogFragment$Result$Success;", "Lcom/avito/android/date_time_picker/TimePickerDialogFragment$Result;", "_avito_date-time-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Success implements Result {

            @Y61.k
            public static final Parcelable.Creator<Success> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final org.threeten.bp.f f132649b;

            /* compiled from: TimePickerDialogFragment.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Success> {
                @Override // android.os.Parcelable.Creator
                public final Success createFromParcel(Parcel parcel) {
                    return new Success((org.threeten.bp.f) parcel.readSerializable());
                }

                @Override // android.os.Parcelable.Creator
                public final Success[] newArray(int i12) {
                    return new Success[i12];
                }
            }

            public Success(@Y61.k org.threeten.bp.f fVar) {
                this.f132649b = fVar;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Success) && L.f(this.f132649b, ((Success) obj).f132649b);
            }

            public final int hashCode() {
                return this.f132649b.hashCode();
            }

            @Y61.k
            public final String toString() {
                return "Success(date=" + this.f132649b + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeSerializable(this.f132649b);
            }
        }
    }

    /* compiled from: TimePickerDialogFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/date_time_picker/TimePickerDialogFragment$a;", "", "<init>", "()V", "_avito_date-time-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static TimePickerDialogFragment a(@Y61.k String str, @Y61.k TimePickerArguments timePickerArguments) {
            TimePickerDialogFragment timePickerDialogFragment = new TimePickerDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putString("arg.request_key", str);
            bundle.putParcelable("arg.time_picker_arguments", timePickerArguments);
            timePickerDialogFragment.setArguments(bundle);
            return timePickerDialogFragment;
        }

        public a() {
        }
    }

    /* compiled from: TimePickerDialogFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ l0.h<Result> f132650l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ TimePickerDialogFragment f132651m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ String f132652n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(l0.h<Result> hVar, TimePickerDialogFragment timePickerDialogFragment, String str) {
            super(0);
            this.f132650l = hVar;
            this.f132651m = timePickerDialogFragment;
            this.f132652n = str;
        }

        /* JADX WARN: Type inference failed for: r1v3, types: [T, com.avito.android.date_time_picker.TimePickerDialogFragment$Result$Canceled] */
        @Override // Y41.a
        public final G0 invoke() {
            l0.h<Result> hVar = this.f132650l;
            if (hVar.f406842b == null) {
                hVar.f406842b = Result.Canceled.f132648b;
            }
            C22960s.a(C22777e.b(new Q("result.key", hVar.f406842b)), this.f132651m, this.f132652n);
            return G0.f406611a;
        }
    }

    public TimePickerDialogFragment() {
        super(0, 1, null);
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment
    public final void e5(@l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.date_time_picker.di.a.a().a(new C28478k(TimePickerDialogScreen.f132677d, s.b(this), null, 4, null), (com.avito.android.date_time_picker.di.c) C29972i.a(C29972i.b(this), com.avito.android.date_time_picker.di.c.class)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f132647i0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    @Override // androidx.fragment.app.DialogFragment
    @Y61.k
    public final Dialog onCreateDialog(@l Bundle bundle) {
        TimePickerArguments timePickerArguments;
        Object serializable;
        String string = requireArguments().getString("arg.request_key");
        if (string == null) {
            throw new IllegalArgumentException("Request key is not provided");
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            timePickerArguments = (TimePickerArguments) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) arguments.getParcelable("arg.time_picker_arguments", TimePickerArguments.class) : arguments.getParcelable("arg.time_picker_arguments"));
        } else {
            timePickerArguments = null;
        }
        if (timePickerArguments == null) {
            throw new IllegalArgumentException("Time picker dialog arguments must not be null");
        }
        ScreenPerformanceTracker screenPerformanceTracker = this.f132647i0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        l0.h hVar = new l0.h();
        Context contextRequireContext = requireContext();
        if (bundle != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                serializable = bundle.getSerializable("key.initial_time", org.threeten.bp.f.class);
            } else {
                Object serializable2 = bundle.getSerializable("key.initial_time");
                if (!(serializable2 instanceof org.threeten.bp.f)) {
                    serializable2 = null;
                }
                serializable = (org.threeten.bp.f) serializable2;
            }
            timePickerArguments = new TimePickerArguments(timePickerArguments.f132605b, timePickerArguments.f132606c, timePickerArguments.f132607d, timePickerArguments.f132608e, (org.threeten.bp.f) serializable, timePickerArguments.f132610g, timePickerArguments.f132611h, timePickerArguments.f132612i, timePickerArguments.f132613j, timePickerArguments.f132614k);
        }
        TimePickerDialog timePickerDialog = new TimePickerDialog(contextRequireContext, timePickerArguments, new h(hVar, 0));
        this.f132646h0 = timePickerDialog;
        timePickerDialog.R(new b(hVar, this, string));
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f132647i0;
        if (screenPerformanceTracker2 == null) {
            screenPerformanceTracker2 = null;
        }
        screenPerformanceTracker2.d();
        TimePickerDialog timePickerDialog2 = this.f132646h0;
        if (timePickerDialog2 == null) {
            return null;
        }
        return timePickerDialog2;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(@Y61.k Bundle bundle) {
        super.onSaveInstanceState(bundle);
        TimePickerDialog timePickerDialog = this.f132646h0;
        if (timePickerDialog == null) {
            timePickerDialog = null;
        }
        bundle.putSerializable("key.initial_time", timePickerDialog.f132615E.f132609f.R(timePickerDialog.f132620J).S(timePickerDialog.f132621K));
    }
}
