package com.avito.android.edit_text_field;

import Ay.InterfaceC13103a;
import Cd.C13243a;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.Fragment;
import androidx.view.InterfaceC22969B;
import androidx.view.InterfaceC22983P;
import androidx.view.InterfaceC23487e;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.C29972i;
import com.avito.android.di.InterfaceC29970g;
import com.avito.android.edit_text_field.EditTextFieldFragment;
import com.avito.android.edit_text_field.di.b;
import com.avito.android.profile_management_core.edit_text_field.AboutPopup;
import com.avito.android.profile_management_core.edit_text_field.FormattedAlertSettings;
import com.avito.android.profile_management_core.edit_text_field.NotSavedAlertSettings;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.K2;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import z1.AbstractC50339a;

/* compiled from: EditTextFieldFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u0006\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/avito/android/edit_text_field/EditTextFieldFragment;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/ui/fragments/c;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "Mode", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class EditTextFieldFragment extends BaseDialogFragment implements com.avito.android.ui.fragments.c, InterfaceC28477j.b {

    /* renamed from: n0, reason: collision with root package name */
    @Y61.k
    public static final a f146886n0 = new a(null);

    /* renamed from: h0, reason: collision with root package name */
    @Inject
    public o f146887h0;

    /* renamed from: i0, reason: collision with root package name */
    @Y61.k
    public final O0 f146888i0;

    /* renamed from: j0, reason: collision with root package name */
    @Inject
    public com.avito.android.util.text.a f146889j0;

    /* renamed from: k0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f146890k0;

    /* renamed from: l0, reason: collision with root package name */
    @Y61.l
    public y f146891l0;

    /* renamed from: m0, reason: collision with root package name */
    public Mode f146892m0;

    /* compiled from: EditTextFieldFragment.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/edit_text_field/EditTextFieldFragment$Mode;", "Landroid/os/Parcelable;", "Basic", "Extended", "Lcom/avito/android/edit_text_field/EditTextFieldFragment$Mode$Basic;", "Lcom/avito/android/edit_text_field/EditTextFieldFragment$Mode$Extended;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Mode extends Parcelable {

        /* compiled from: EditTextFieldFragment.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/edit_text_field/EditTextFieldFragment$Mode$Basic;", "Lcom/avito/android/edit_text_field/EditTextFieldFragment$Mode;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @K51.d
        public static final class Basic implements Mode {

            @Y61.k
            public static final Parcelable.Creator<Basic> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final String f146893b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.l
            public final String f146894c;

            /* renamed from: d, reason: collision with root package name */
            @Y61.l
            public final String f146895d;

            /* renamed from: e, reason: collision with root package name */
            @Y61.l
            public final String f146896e;

            /* renamed from: f, reason: collision with root package name */
            @Y61.k
            public final String f146897f;

            /* compiled from: EditTextFieldFragment.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Basic> {
                @Override // android.os.Parcelable.Creator
                public final Basic createFromParcel(Parcel parcel) {
                    return new Basic(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Basic[] newArray(int i12) {
                    return new Basic[i12];
                }
            }

            public Basic(@Y61.k String str, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4, @Y61.k String str5) {
                this.f146893b = str;
                this.f146894c = str2;
                this.f146895d = str3;
                this.f146896e = str4;
                this.f146897f = str5;
            }

            @Override // com.avito.android.edit_text_field.EditTextFieldFragment.Mode
            @Y61.k
            /* renamed from: T0, reason: from getter */
            public final String getF146903g() {
                return this.f146897f;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // com.avito.android.edit_text_field.EditTextFieldFragment.Mode
            @Y61.l
            /* renamed from: getPlaceholder, reason: from getter */
            public final String getF146902f() {
                return this.f146896e;
            }

            @Override // com.avito.android.edit_text_field.EditTextFieldFragment.Mode
            @Y61.l
            /* renamed from: getTitle, reason: from getter */
            public final String getF146899c() {
                return this.f146894c;
            }

            @Override // com.avito.android.edit_text_field.EditTextFieldFragment.Mode
            @Y61.l
            /* renamed from: getValue, reason: from getter */
            public final String getF146901e() {
                return this.f146895d;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeString(this.f146893b);
                parcel.writeString(this.f146894c);
                parcel.writeString(this.f146895d);
                parcel.writeString(this.f146896e);
                parcel.writeString(this.f146897f);
            }
        }

        /* compiled from: EditTextFieldFragment.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/edit_text_field/EditTextFieldFragment$Mode$Extended;", "Lcom/avito/android/edit_text_field/EditTextFieldFragment$Mode;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @K51.d
        public static final class Extended implements Mode {

            @Y61.k
            public static final Parcelable.Creator<Extended> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final String f146898b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.l
            public final String f146899c;

            /* renamed from: d, reason: collision with root package name */
            @Y61.k
            public final String f146900d;

            /* renamed from: e, reason: collision with root package name */
            @Y61.k
            public final String f146901e;

            /* renamed from: f, reason: collision with root package name */
            @Y61.l
            public final String f146902f;

            /* renamed from: g, reason: collision with root package name */
            @Y61.k
            public final String f146903g;

            /* renamed from: h, reason: collision with root package name */
            @Y61.l
            public final String f146904h;

            /* renamed from: i, reason: collision with root package name */
            @Y61.l
            public final Integer f146905i;

            /* renamed from: j, reason: collision with root package name */
            @Y61.l
            public final NotSavedAlertSettings f146906j;

            /* renamed from: k, reason: collision with root package name */
            @Y61.l
            public final FormattedAlertSettings f146907k;

            /* renamed from: l, reason: collision with root package name */
            @Y61.l
            public final AboutPopup f146908l;

            /* compiled from: EditTextFieldFragment.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Extended> {
                @Override // android.os.Parcelable.Creator
                public final Extended createFromParcel(Parcel parcel) {
                    return new Extended(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (NotSavedAlertSettings) parcel.readParcelable(Extended.class.getClassLoader()), (FormattedAlertSettings) parcel.readParcelable(Extended.class.getClassLoader()), (AboutPopup) parcel.readParcelable(Extended.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Extended[] newArray(int i12) {
                    return new Extended[i12];
                }
            }

            public Extended(@Y61.k String str, @Y61.l String str2, @Y61.k String str3, @Y61.k String str4, @Y61.l String str5, @Y61.k String str6, @Y61.l String str7, @Y61.l Integer num, @Y61.l NotSavedAlertSettings notSavedAlertSettings, @Y61.l FormattedAlertSettings formattedAlertSettings, @Y61.l AboutPopup aboutPopup) {
                this.f146898b = str;
                this.f146899c = str2;
                this.f146900d = str3;
                this.f146901e = str4;
                this.f146902f = str5;
                this.f146903g = str6;
                this.f146904h = str7;
                this.f146905i = num;
                this.f146906j = notSavedAlertSettings;
                this.f146907k = formattedAlertSettings;
                this.f146908l = aboutPopup;
            }

            @Override // com.avito.android.edit_text_field.EditTextFieldFragment.Mode
            @Y61.k
            /* renamed from: T0, reason: from getter */
            public final String getF146903g() {
                return this.f146903g;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // com.avito.android.edit_text_field.EditTextFieldFragment.Mode
            @Y61.l
            /* renamed from: getPlaceholder, reason: from getter */
            public final String getF146902f() {
                return this.f146902f;
            }

            @Override // com.avito.android.edit_text_field.EditTextFieldFragment.Mode
            @Y61.l
            /* renamed from: getTitle, reason: from getter */
            public final String getF146899c() {
                return this.f146899c;
            }

            @Override // com.avito.android.edit_text_field.EditTextFieldFragment.Mode
            @Y61.k
            /* renamed from: getValue, reason: from getter */
            public final String getF146901e() {
                return this.f146901e;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeString(this.f146898b);
                parcel.writeString(this.f146899c);
                parcel.writeString(this.f146900d);
                parcel.writeString(this.f146901e);
                parcel.writeString(this.f146902f);
                parcel.writeString(this.f146903g);
                parcel.writeString(this.f146904h);
                Integer num = this.f146905i;
                if (num == null) {
                    parcel.writeInt(0);
                } else {
                    com.avito.android.actions_sheet.a.C(parcel, 1, num);
                }
                parcel.writeParcelable(this.f146906j, i12);
                parcel.writeParcelable(this.f146907k, i12);
                parcel.writeParcelable(this.f146908l, i12);
            }
        }

        @Y61.k
        /* renamed from: T0 */
        String getF146903g();

        @Y61.l
        /* renamed from: getPlaceholder */
        String getF146902f();

        @Y61.l
        /* renamed from: getTitle */
        String getF146899c();

        @Y61.l
        /* renamed from: getValue */
        String getF146901e();
    }

    /* compiled from: EditTextFieldFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/edit_text_field/EditTextFieldFragment$a;", "", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f146909l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Y41.a aVar) {
            super(0);
            this.f146909l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f146909l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<Fragment> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return EditTextFieldFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ c f146911l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(c cVar) {
            super(0);
            this.f146911l = cVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f146911l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f146912l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f146912l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f146912l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f146913l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f146913l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f146913l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: EditTextFieldFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/edit_text_field/n;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/edit_text_field/n;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<n> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        public final n invoke() {
            o oVar = EditTextFieldFragment.this.f146887h0;
            if (oVar == null) {
                oVar = null;
            }
            return (n) oVar.get();
        }
    }

    public EditTextFieldFragment() {
        super(0, 1, null);
        b bVar = new b(new g());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new d(new c()));
        this.f146888i0 = new O0(m0.f406844a.b(n.class), new e(interfaceC42726CB), bVar, new f(interfaceC42726CB));
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment
    public final void e5(@Y61.l Bundle bundle) {
        com.avito.android.analytics.screens.D.f90335a.getClass();
        com.avito.android.analytics.screens.F fA2 = D.a.a();
        Bundle arguments = getArguments();
        if (arguments != null) {
            Mode mode = (Mode) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) arguments.getParcelable("key_mode", Mode.class) : arguments.getParcelable("key_mode"));
            if (mode != null) {
                this.f146892m0 = mode;
                b.a aVarA = com.avito.android.edit_text_field.di.a.a();
                Resources resources = getResources();
                Mode mode2 = this.f146892m0;
                aVarA.a(this, resources, mode2 == null ? null : mode2, new C28478k(ProfileManagementEditTextScreen.f146929d, com.avito.android.analytics.screens.s.b(this), null, 4, null), (InterfaceC29970g) C29972i.a(C29972i.b(this), InterfaceC29970g.class), cv.c.b(this)).a(this);
                ScreenPerformanceTracker screenPerformanceTracker = this.f146890k0;
                (screenPerformanceTracker != null ? screenPerformanceTracker : null).a(fA2.b());
                return;
            }
        }
        throw new IllegalArgumentException("Mode must be specified!");
    }

    @Override // com.avito.android.ui.fragments.c
    public final boolean i0() {
        ((n) this.f146888i0.getValue()).accept(InterfaceC13103a.C0031a.f735a);
        return true;
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment, androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f146890k0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        return layoutInflater.inflate(R.layout.ext_profile_edit_text, viewGroup, false);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f146891l0 = null;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        y yVar = this.f146891l0;
        if (yVar != null) {
            yVar.f147044j.v();
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        y yVar = this.f146891l0;
        if (yVar != null) {
            K2.d(yVar.f147044j, true);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        InterfaceC23487e parentFragment = getParentFragment();
        v vVar = parentFragment instanceof v ? (v) parentFragment : null;
        if (vVar == null) {
            throw new IllegalStateException("Parent fragment must implement ExtendedProfileSettingsRouter!");
        }
        p pVarS0 = vVar.S0();
        Mode mode = this.f146892m0;
        Mode mode2 = mode == null ? null : mode;
        InterfaceC22983P viewLifecycleOwner = getViewLifecycleOwner();
        n nVar = (n) this.f146888i0.getValue();
        com.avito.android.util.text.a aVar = this.f146889j0;
        com.avito.android.util.text.a aVar2 = aVar != null ? aVar : null;
        ScreenPerformanceTracker screenPerformanceTracker = this.f146890k0;
        this.f146891l0 = new y(view, this, mode2, nVar, viewLifecycleOwner, pVarS0, aVar2, screenPerformanceTracker != null ? screenPerformanceTracker : null);
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: com.avito.android.edit_text_field.b
                @Override // android.content.DialogInterface.OnKeyListener
                public final boolean onKey(DialogInterface dialogInterface, int i12, KeyEvent keyEvent) {
                    EditTextFieldFragment.a aVar3 = EditTextFieldFragment.f146886n0;
                    if (i12 != 4 || keyEvent.getAction() != 0) {
                        return true;
                    }
                    ((n) this.f146940b.f146888i0.getValue()).accept(InterfaceC13103a.C0031a.f735a);
                    return true;
                }
            });
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null) {
            dialog2.setCanceledOnTouchOutside(false);
        }
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f146890k0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
    }
}
