package com.avito.android.suggest_locations.sheet;

import Y61.k;
import Y61.l;
import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.H;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.lib.design.bottom_sheet.d;
import com.avito.android.publish.PublishIntentFactory;
import com.avito.android.suggest_locations.SuggestLocationsArguments;
import com.avito.android.suggest_locations.SuggestLocationsFragment;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35966w1;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: SuggestLocationsFragmentSheet.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/suggest_locations/sheet/SuggestLocationsFragmentSheet;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_suggest-locations_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SuggestLocationsFragmentSheet extends BaseDialogFragment implements InterfaceC28477j.a {

    /* renamed from: k0, reason: collision with root package name */
    @k
    public static final a f292358k0 = new a(null);

    /* renamed from: h0, reason: collision with root package name */
    @l
    public d f292359h0;

    /* renamed from: i0, reason: collision with root package name */
    @l
    public SuggestLocationsSheetArguments f292360i0;

    /* renamed from: j0, reason: collision with root package name */
    public SuggestLocationsFragment f292361j0;

    /* compiled from: SuggestLocationsFragmentSheet.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/suggest_locations/sheet/SuggestLocationsFragmentSheet$a;", "", "<init>", "()V", "", "KEY_ARGUMENTS", "Ljava/lang/String;", "_avito_suggest-locations_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: SuggestLocationsFragmentSheet.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.suggest_locations.sheet.SuggestLocationsFragmentSheet$a$a, reason: collision with other inner class name */
        public static final class C8867a extends N implements Y41.l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ SuggestLocationsSheetArguments f292362l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C8867a(SuggestLocationsSheetArguments suggestLocationsSheetArguments) {
                super(1);
                this.f292362l = suggestLocationsSheetArguments;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                bundle.putParcelable("key_arguments", this.f292362l);
                return G0.f406611a;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @k
        public static SuggestLocationsFragmentSheet a(@k SuggestLocationsSheetArguments suggestLocationsSheetArguments) {
            SuggestLocationsFragmentSheet suggestLocationsFragmentSheet = new SuggestLocationsFragmentSheet();
            C35966w1.a(suggestLocationsFragmentSheet, -1, new C8867a(suggestLocationsSheetArguments));
            return suggestLocationsFragmentSheet;
        }

        public a() {
        }
    }

    /* compiled from: SuggestLocationsFragmentSheet.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            SuggestLocationsFragmentSheet.this.dismiss();
            return G0.f406611a;
        }
    }

    public SuggestLocationsFragmentSheet() {
        super(0, 1, null);
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            SuggestLocationsSheetArguments suggestLocationsSheetArguments = (SuggestLocationsSheetArguments) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) arguments.getParcelable("key_arguments", SuggestLocationsSheetArguments.class) : arguments.getParcelable("key_arguments"));
            if (suggestLocationsSheetArguments != null) {
                this.f292360i0 = suggestLocationsSheetArguments;
            }
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    @k
    public final Dialog onCreateDialog(@l Bundle bundle) {
        d dVar = new d(requireContext(), getTheme());
        dVar.S(C35835l0.g(dVar.getContext()).y);
        dVar.K(true);
        dVar.setOnShowListener(new com.avito.android.suggest_locations.sheet.a());
        this.f292359h0 = dVar;
        return dVar;
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment, androidx.fragment.app.Fragment
    @l
    public final View onCreateView(@k LayoutInflater layoutInflater, @l ViewGroup viewGroup, @l Bundle bundle) {
        return layoutInflater.inflate(R.layout.suggest_locations_sheet_fragment, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@k View view, @l Bundle bundle) {
        String str;
        super.onViewCreated(view, bundle);
        d dVar = this.f292359h0;
        String str2 = "";
        if (dVar != null) {
            SuggestLocationsSheetArguments suggestLocationsSheetArguments = this.f292360i0;
            String str3 = suggestLocationsSheetArguments != null ? suggestLocationsSheetArguments.f292377o : null;
            if (str3 == null) {
                str3 = "";
            }
            d.M(dVar, str3, true, true, 2);
            dVar.R(new b());
        }
        SuggestLocationsSheetArguments suggestLocationsSheetArguments2 = this.f292360i0;
        if (suggestLocationsSheetArguments2 != null && (str = suggestLocationsSheetArguments2.f292376n) != null) {
            str2 = str;
        }
        getChildFragmentManager().p0(str2, this, new com.avito.android.gig_shift_action.ui.a(8, this, str2));
        SuggestLocationsFragment.a aVar = SuggestLocationsFragment.f292138F0;
        SuggestLocationsSheetArguments suggestLocationsSheetArguments3 = this.f292360i0;
        SuggestLocationsArguments suggestLocationsArguments = suggestLocationsSheetArguments3 != null ? new SuggestLocationsArguments(suggestLocationsSheetArguments3.f292364b, suggestLocationsSheetArguments3.f292365c, suggestLocationsSheetArguments3.f292366d, suggestLocationsSheetArguments3.f292367e, suggestLocationsSheetArguments3.f292368f, suggestLocationsSheetArguments3.f292369g, suggestLocationsSheetArguments3.f292370h, suggestLocationsSheetArguments3.f292371i, suggestLocationsSheetArguments3.f292372j, suggestLocationsSheetArguments3.f292373k, suggestLocationsSheetArguments3.f292374l, suggestLocationsSheetArguments3.f292375m, suggestLocationsSheetArguments3.f292376n, null, null, 24576, null) : new SuggestLocationsArguments(null, null, null, "", null, PublishIntentFactory.SuggestLocationsFlowType.DefaultNoMap.f231996b, null, null, true, false, true, null, str2, null, null, 27328, null);
        aVar.getClass();
        this.f292361j0 = SuggestLocationsFragment.a.a(suggestLocationsArguments);
        H hE2 = getChildFragmentManager().e();
        SuggestLocationsFragment suggestLocationsFragment = this.f292361j0;
        if (suggestLocationsFragment == null) {
            suggestLocationsFragment = null;
        }
        hE2.j(R.id.suggest_locations_sheet_container, suggestLocationsFragment, str2, 1);
        hE2.e();
    }
}
