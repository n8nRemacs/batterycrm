package com.avito.android.data_picker_show.datapickershow;

import Cd.C13243a;
import Y61.l;
import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.H;
import androidx.core.os.C22777e;
import androidx.fragment.app.C22960s;
import androidx.fragment.app.Fragment;
import androidx.view.InterfaceC22969B;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.data_picker_show.DataPickerArgs;
import com.avito.android.data_picker_show.datapickershow.e;
import com.avito.android.data_picker_show.datapickershow.perf_screen.DataPickerShowScreen;
import com.avito.android.deeplink_handler.view.d;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.bottom_sheet.q;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.C35835l0;
import com.avito.android.util.N0;
import com.avito.beduin.v2.engine.C36273j;
import com.avito.beduin.v2.engine.field.entity.C36268a;
import gu.InterfaceC40736a;
import gu.InterfaceC40737b;
import iu.C42111a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import mV0.C44020b;
import z1.AbstractC50339a;

/* compiled from: DataPickerShowFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/avito/android/data_picker_show/datapickershow/DataPickerShowFragment;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "Result", "_avito_data-picker-show_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DataPickerShowFragment extends BaseDialogFragment implements InterfaceC28477j.b {

    /* renamed from: s0, reason: collision with root package name */
    @Y61.k
    public static final a f132472s0 = new a(null);

    /* renamed from: h0, reason: collision with root package name */
    @Inject
    public com.avito.android.data_picker_show.datapickershow.k f132473h0;

    /* renamed from: i0, reason: collision with root package name */
    @Y61.k
    public final O0 f132474i0;

    /* renamed from: j0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f132475j0;

    /* renamed from: k0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.view.d f132476k0;

    /* renamed from: l0, reason: collision with root package name */
    @Inject
    public e.a f132477l0;

    /* renamed from: m0, reason: collision with root package name */
    @Inject
    public C44020b f132478m0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public C42111a f132479n0;

    /* renamed from: o0, reason: collision with root package name */
    public com.avito.android.lib.design.bottom_sheet.d f132480o0;

    /* renamed from: p0, reason: collision with root package name */
    public com.avito.android.data_picker_show.datapickershow.e f132481p0;

    /* renamed from: q0, reason: collision with root package name */
    public String f132482q0;

    /* renamed from: r0, reason: collision with root package name */
    @l
    public Result f132483r0;

    /* compiled from: DataPickerShowFragment.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/data_picker_show/datapickershow/DataPickerShowFragment$Result;", "Landroid/os/Parcelable;", "Cancel", "Success", "Lcom/avito/android/data_picker_show/datapickershow/DataPickerShowFragment$Result$Cancel;", "Lcom/avito/android/data_picker_show/datapickershow/DataPickerShowFragment$Result$Success;", "_avito_data-picker-show_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Result extends Parcelable {

        /* compiled from: DataPickerShowFragment.kt */
        @K51.d
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/data_picker_show/datapickershow/DataPickerShowFragment$Result$Cancel;", "Lcom/avito/android/data_picker_show/datapickershow/DataPickerShowFragment$Result;", "<init>", "()V", "_avito_data-picker-show_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Cancel implements Result {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final Cancel f132484b = new Cancel();

            @Y61.k
            public static final Parcelable.Creator<Cancel> CREATOR = new a();

            /* compiled from: DataPickerShowFragment.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Cancel> {
                @Override // android.os.Parcelable.Creator
                public final Cancel createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return Cancel.f132484b;
                }

                @Override // android.os.Parcelable.Creator
                public final Cancel[] newArray(int i12) {
                    return new Cancel[i12];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof Cancel);
            }

            public final int hashCode() {
                return 1209059793;
            }

            @Y61.k
            public final String toString() {
                return "Cancel";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeInt(1);
            }
        }

        /* compiled from: DataPickerShowFragment.kt */
        @K51.d
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/data_picker_show/datapickershow/DataPickerShowFragment$Result$Success;", "Lcom/avito/android/data_picker_show/datapickershow/DataPickerShowFragment$Result;", "_avito_data-picker-show_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Success implements Result {

            @Y61.k
            public static final Parcelable.Creator<Success> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @l
            public final List<String> f132485b;

            /* compiled from: DataPickerShowFragment.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Success> {
                @Override // android.os.Parcelable.Creator
                public final Success createFromParcel(Parcel parcel) {
                    return new Success(parcel.createStringArrayList());
                }

                @Override // android.os.Parcelable.Creator
                public final Success[] newArray(int i12) {
                    return new Success[i12];
                }
            }

            public Success(@l List<String> list) {
                this.f132485b = list;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Success) && L.f(this.f132485b, ((Success) obj).f132485b);
            }

            public final int hashCode() {
                List<String> list = this.f132485b;
                if (list == null) {
                    return 0;
                }
                return list.hashCode();
            }

            @Y61.k
            public final String toString() {
                return H.p(new StringBuilder("Success(selected="), this.f132485b, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeStringList(this.f132485b);
            }
        }
    }

    /* compiled from: DataPickerShowFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/avito/android/data_picker_show/datapickershow/DataPickerShowFragment$a;", "", "<init>", "()V", "", "BDUI_MEMO_REPO_KEY", "Ljava/lang/String;", "DATA_PICKER_ARGS", "DATA_PICKER_REQUEST_KEY", "RESULT_KEY", "_avito_data-picker-show_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: DataPickerShowFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends kotlin.jvm.internal.H implements Y41.l<InterfaceC40737b, G0> {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.collections.z0] */
        /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r4v3, types: [java.util.ArrayList] */
        @Override // Y41.l
        public final G0 invoke(InterfaceC40737b interfaceC40737b) {
            ?? arrayList;
            InterfaceC40737b interfaceC40737b2 = interfaceC40737b;
            DataPickerShowFragment dataPickerShowFragment = (DataPickerShowFragment) this.receiver;
            a aVar = DataPickerShowFragment.f132472s0;
            dataPickerShowFragment.getClass();
            if (interfaceC40737b2 instanceof InterfaceC40737b.a) {
                List<String> list = ((InterfaceC40737b.a) interfaceC40737b2).f396930a;
                dataPickerShowFragment.f132483r0 = new Result.Success(list);
                C44020b c44020b = dataPickerShowFragment.f132478m0;
                if (c44020b == null) {
                    c44020b = null;
                }
                C42111a c42111a = dataPickerShowFragment.f132479n0;
                if (c42111a == null) {
                    c42111a = null;
                }
                List<String> list2 = list;
                c42111a.getClass();
                if (list2 != null) {
                    List<String> list3 = list2;
                    arrayList = new ArrayList(C42745f0.q(list3, 10));
                    Iterator it = list3.iterator();
                    while (it.hasNext()) {
                        arrayList.add(C36273j.a(c42111a.f405352a).e((String) it.next()));
                    }
                } else {
                    arrayList = C42784z0.f406748b;
                }
                c44020b.c(new C36268a(arrayList), "DataPickerBduiResultKey");
                Result result = dataPickerShowFragment.f132483r0;
                String str = dataPickerShowFragment.f132482q0;
                if (str == null) {
                    str = null;
                }
                C22960s.a(C22777e.b(new Q("data_picker.result_key", result)), dataPickerShowFragment, str);
                com.avito.android.lib.design.bottom_sheet.d dVar = dataPickerShowFragment.f132480o0;
                N0.a(dVar != null ? dVar : null);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: DataPickerShowFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lgu/c;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Lgu/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<gu.c, G0> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(gu.c cVar) {
            gu.c cVar2 = cVar;
            DataPickerShowFragment dataPickerShowFragment = DataPickerShowFragment.this;
            ScreenPerformanceTracker screenPerformanceTracker = dataPickerShowFragment.f132475j0;
            if (screenPerformanceTracker == null) {
                screenPerformanceTracker = null;
            }
            com.avito.android.analytics.screens.mvi.a.i(cVar2, screenPerformanceTracker, new com.avito.android.data_picker_show.datapickershow.b(dataPickerShowFragment));
            return G0.f406611a;
        }
    }

    /* compiled from: DataPickerShowFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<G0> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            DataPickerShowFragment dataPickerShowFragment = DataPickerShowFragment.this;
            if (dataPickerShowFragment.f132483r0 == null) {
                dataPickerShowFragment.f132483r0 = Result.Cancel.f132484b;
            }
            String str = dataPickerShowFragment.f132482q0;
            if (str == null) {
                str = null;
            }
            C22960s.a(C22777e.b(new Q("data_picker.result_key", dataPickerShowFragment.f132483r0)), dataPickerShowFragment, str);
            return G0.f406611a;
        }
    }

    /* compiled from: DataPickerShowFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class e extends kotlin.jvm.internal.H implements Y41.l<InterfaceC40736a, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC40736a interfaceC40736a) {
            ((com.avito.android.data_picker_show.datapickershow.j) this.receiver).accept(interfaceC40736a);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f132488l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Y41.a aVar) {
            super(0);
            this.f132488l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f132488l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<Fragment> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return DataPickerShowFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ g f132490l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(g gVar) {
            super(0);
            this.f132490l = gVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f132490l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f132491l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f132491l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f132491l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f132492l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f132492l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f132492l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: DataPickerShowFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/data_picker_show/datapickershow/j;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/data_picker_show/datapickershow/j;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<com.avito.android.data_picker_show.datapickershow.j> {
        public k() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.data_picker_show.datapickershow.j invoke() {
            com.avito.android.data_picker_show.datapickershow.k kVar = DataPickerShowFragment.this.f132473h0;
            if (kVar == null) {
                kVar = null;
            }
            return (com.avito.android.data_picker_show.datapickershow.j) kVar.get();
        }
    }

    public DataPickerShowFragment() {
        super(0, 1, null);
        f fVar = new f(new k());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new h(new g()));
        this.f132474i0 = new O0(m0.f406844a.b(com.avito.android.data_picker_show.datapickershow.j.class), new i(interfaceC42726CB), fVar, new j(interfaceC42726CB));
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment
    public final void e5(@l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        Bundle bundleRequireArguments = requireArguments();
        DataPickerArgs dataPickerArgs = (DataPickerArgs) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundleRequireArguments.getParcelable("data_picker.args", DataPickerArgs.class) : bundleRequireArguments.getParcelable("data_picker.args"));
        if (dataPickerArgs == null) {
            throw new IllegalArgumentException("data_picker.args are not provided");
        }
        List<String> list = dataPickerArgs.f132464c;
        if (list != null && dataPickerArgs.f132463b.size() != list.size()) {
            throw new IllegalArgumentException((DataPickerArgs.class + ": values and preselect lists sizes must be equal").toString());
        }
        String string = requireArguments().getString("data_picker.request_key");
        if (string == null) {
            throw new IllegalArgumentException("requestKey data_picker.request_key is not provided");
        }
        this.f132482q0 = string;
        com.avito.android.data_picker_show.di.a.a().a(new C28478k(DataPickerShowScreen.f132528d, s.b(this), "DataPickerShow"), dataPickerArgs, (com.avito.android.data_picker_show.di.c) C29972i.a(C29972i.b(this), com.avito.android.data_picker_show.di.c.class), cv.c.b(this)).fj(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f132475j0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.DialogFragment
    @Y61.k
    public final Dialog onCreateDialog(@l Bundle bundle) {
        O0 o02 = this.f132474i0;
        com.avito.android.arch.mvi.android.f.a((com.avito.android.data_picker_show.datapickershow.j) o02.getValue(), this, Lifecycle.State.f46682e, new b(1, this, DataPickerShowFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/data_picker_show/datapickershow/mvi/entity/DataPickerShowOneTimeEvent;)V", 0), new c());
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(requireContext(), 0, 2, 0 == true ? 1 : 0);
        View viewInflate = View.inflate(dVar.getContext(), R.layout.data_picker_layout, null);
        dVar.f178527u = true;
        dVar.F(viewInflate, Integer.valueOf(R.layout.data_picker_dialog_footer), null);
        dVar.S(C35835l0.g(dVar.getContext()).y);
        if (dVar.f178529w) {
            dVar.f178529w = false;
            q qVar = dVar.f178530x;
            if (qVar != null) {
                qVar.setDraggable(false);
            }
        }
        dVar.R(new d());
        e.a aVar = this.f132477l0;
        this.f132481p0 = (aVar != null ? aVar : null).a(new e(1, (com.avito.android.data_picker_show.datapickershow.j) o02.getValue(), com.avito.android.data_picker_show.datapickershow.j.class, "accept", "accept(Ljava/lang/Object;)V", 0), dVar);
        this.f132480o0 = dVar;
        return dVar;
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment, androidx.fragment.app.Fragment
    @l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @l ViewGroup viewGroup, @l Bundle bundle) {
        com.avito.android.deeplink_handler.view.d dVar = this.f132476k0;
        if (dVar == null) {
            dVar = null;
        }
        d.a.b(dVar, this, (com.avito.android.deeplink_handler.view.impl.i) b5(), 28);
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @l Bundle bundle) {
        super.onViewCreated(view, bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f132475j0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.d();
    }
}
