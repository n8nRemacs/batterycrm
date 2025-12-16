package com.avito.android.user_adverts.tab_actions.attention;

import Y41.l;
import Y61.k;
import android.app.Dialog;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import com.avito.android.R;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.bottom_sheet.d;
import com.avito.android.lib.design.button.Button;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.user_adverts.model.UserAdvertActionAttentionInfo;
import com.avito.android.user_adverts.tab_actions.attention.UserAdvertsActionAttentionFragment;
import com.avito.android.user_adverts.tab_actions.attention.di.c;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35966w1;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: UserAdvertsActionAttentionFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/user_adverts/tab_actions/attention/UserAdvertsActionAttentionFragment;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class UserAdvertsActionAttentionFragment extends BaseDialogFragment implements InterfaceC28477j.b {

    /* renamed from: o0, reason: collision with root package name */
    @k
    public static final a f314199o0 = new a(null);

    /* renamed from: h0, reason: collision with root package name */
    @k
    public final Object f314200h0;

    /* renamed from: i0, reason: collision with root package name */
    public TextView f314201i0;

    /* renamed from: j0, reason: collision with root package name */
    public TextView f314202j0;

    /* renamed from: k0, reason: collision with root package name */
    public Button f314203k0;

    /* renamed from: l0, reason: collision with root package name */
    public Button f314204l0;

    /* renamed from: m0, reason: collision with root package name */
    @Inject
    public com.avito.android.util.text.a f314205m0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f314206n0;

    /* compiled from: UserAdvertsActionAttentionFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/user_adverts/tab_actions/attention/UserAdvertsActionAttentionFragment$a;", "", "<init>", "()V", "", "KEY_USER_ADVERTS_ATTENTION_DATA", "Ljava/lang/String;", "REQUEST_KEY_USER_ADVERTS_ATTENTION_DATA", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: UserAdvertsActionAttentionFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.user_adverts.tab_actions.attention.UserAdvertsActionAttentionFragment$a$a, reason: collision with other inner class name */
        public static final class C9693a extends N implements l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ UserAdvertsActionAttentionData f314207l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C9693a(UserAdvertsActionAttentionData userAdvertsActionAttentionData) {
                super(1);
                this.f314207l = userAdvertsActionAttentionData;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                bundle.putParcelable("key_user_adverts_attention_dialog_fragment_data", this.f314207l);
                return G0.f406611a;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @k
        public static DialogFragment a(@k UserAdvertsActionAttentionData userAdvertsActionAttentionData) {
            UserAdvertsActionAttentionFragment userAdvertsActionAttentionFragment = new UserAdvertsActionAttentionFragment();
            C35966w1.a(userAdvertsActionAttentionFragment, -1, new C9693a(userAdvertsActionAttentionData));
            return userAdvertsActionAttentionFragment;
        }

        public a() {
        }
    }

    /* compiled from: UserAdvertsActionAttentionFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/user_adverts/tab_actions/attention/UserAdvertsActionAttentionData;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<UserAdvertsActionAttentionData> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final UserAdvertsActionAttentionData invoke() {
            Bundle bundleRequireArguments = UserAdvertsActionAttentionFragment.this.requireArguments();
            Parcelable parcelable = Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundleRequireArguments.getParcelable("key_user_adverts_attention_dialog_fragment_data", UserAdvertsActionAttentionData.class) : bundleRequireArguments.getParcelable("key_user_adverts_attention_dialog_fragment_data");
            if (parcelable != null) {
                return (UserAdvertsActionAttentionData) parcelable;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    public UserAdvertsActionAttentionFragment() {
        super(0, 1, null);
        this.f314200h0 = C42727D.b(LazyThreadSafetyMode.f406616d, new b());
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.user_adverts.tab_actions.attention.di.a.a().a(s.b(this), (c) C29972i.a(C29972i.b(this), c.class)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f314206n0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    /* JADX WARN: Type inference failed for: r4v19, types: [java.lang.Object, kotlin.C] */
    @Override // androidx.fragment.app.DialogFragment
    @k
    public final Dialog onCreateDialog(@Y61.l Bundle bundle) throws Resources.NotFoundException {
        String quantityString;
        ScreenPerformanceTracker screenPerformanceTracker = this.f314206n0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        d dVar = new d(new ContextThemeWrapper(requireContext(), R.style.Theme_DesignSystem_Re23), 0, 2, null);
        dVar.D(R.layout.user_adverts_actions_attention_dialog_content_re23, true);
        dVar.S(C35835l0.i(dVar.getContext()).heightPixels);
        d.M(dVar, null, false, true, 7);
        this.f314201i0 = (TextView) dVar.findViewById(R.id.user_advert_actions_attention_title);
        this.f314202j0 = (TextView) dVar.findViewById(R.id.user_advert_actions_attention_description);
        this.f314203k0 = (Button) dVar.findViewById(R.id.user_advert_actions_attention_secondary_btn);
        this.f314204l0 = (Button) dVar.findViewById(R.id.user_advert_actions_attention_primary_btn);
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f314206n0;
        if (screenPerformanceTracker2 == null) {
            screenPerformanceTracker2 = null;
        }
        screenPerformanceTracker2.d();
        ScreenPerformanceTracker screenPerformanceTracker3 = this.f314206n0;
        if (screenPerformanceTracker3 == null) {
            screenPerformanceTracker3 = null;
        }
        screenPerformanceTracker3.m(screenPerformanceTracker3.getF305951e());
        ?? r42 = this.f314200h0;
        UserAdvertActionAttentionInfo userAdvertActionAttentionInfo = ((UserAdvertsActionAttentionData) r42.getValue()).f314197e;
        TextView textView = this.f314201i0;
        if (textView == null) {
            textView = null;
        }
        String str = ((UserAdvertsActionAttentionData) r42.getValue()).f314197e.f312146b;
        if (((UserAdvertsActionAttentionData) r42.getValue()).f314197e.f312147c) {
            int i12 = ((UserAdvertsActionAttentionData) r42.getValue()).f314195c;
            quantityString = getResources().getQuantityString(R.plurals.user_adverts_actions_attention_quantity_title_text, i12, str, Integer.valueOf(i12));
        } else {
            quantityString = getResources().getString(R.string.user_adverts_actions_attention_title_text, str);
        }
        textView.setText(quantityString);
        TextView textView2 = this.f314202j0;
        if (textView2 == null) {
            textView2 = null;
        }
        com.avito.android.util.text.a aVar = this.f314205m0;
        if (aVar == null) {
            aVar = null;
        }
        textView2.setText(aVar.c(dVar.getContext(), userAdvertActionAttentionInfo.f312150f));
        Button button = this.f314203k0;
        if (button == null) {
            button = null;
        }
        button.setState(new UU.a(userAdvertActionAttentionInfo.f312149e, null, false, false, false, null, null, null, null, false, 1022, null));
        Button button2 = this.f314204l0;
        if (button2 == null) {
            button2 = null;
        }
        button2.setState(new UU.a(userAdvertActionAttentionInfo.f312148d, null, false, false, false, null, null, null, null, false, 1022, null));
        Button button3 = this.f314204l0;
        if (button3 == null) {
            button3 = null;
        }
        final int i13 = 0;
        button3.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.user_adverts.tab_actions.attention.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ UserAdvertsActionAttentionFragment f314210c;

            {
                this.f314210c = this;
            }

            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.C] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserAdvertsActionAttentionFragment userAdvertsActionAttentionFragment = this.f314210c;
                switch (i13) {
                    case 0:
                        UserAdvertsActionAttentionFragment.a aVar2 = UserAdvertsActionAttentionFragment.f314199o0;
                        FragmentManager parentFragmentManager = userAdvertsActionAttentionFragment.getParentFragmentManager();
                        Bundle bundle2 = new Bundle(1);
                        bundle2.putParcelable("key_user_adverts_attention_dialog_fragment_data", (UserAdvertsActionAttentionData) userAdvertsActionAttentionFragment.f314200h0.getValue());
                        G0 g02 = G0.f406611a;
                        parentFragmentManager.o0(bundle2, "request_key_user_adverts_attention_dialog_fragment_data");
                        userAdvertsActionAttentionFragment.dismiss();
                        break;
                    default:
                        UserAdvertsActionAttentionFragment.a aVar3 = UserAdvertsActionAttentionFragment.f314199o0;
                        userAdvertsActionAttentionFragment.dismiss();
                        break;
                }
            }
        });
        Button button4 = this.f314203k0;
        if (button4 == null) {
            button4 = null;
        }
        final int i14 = 1;
        button4.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.user_adverts.tab_actions.attention.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ UserAdvertsActionAttentionFragment f314210c;

            {
                this.f314210c = this;
            }

            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.C] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserAdvertsActionAttentionFragment userAdvertsActionAttentionFragment = this.f314210c;
                switch (i14) {
                    case 0:
                        UserAdvertsActionAttentionFragment.a aVar2 = UserAdvertsActionAttentionFragment.f314199o0;
                        FragmentManager parentFragmentManager = userAdvertsActionAttentionFragment.getParentFragmentManager();
                        Bundle bundle2 = new Bundle(1);
                        bundle2.putParcelable("key_user_adverts_attention_dialog_fragment_data", (UserAdvertsActionAttentionData) userAdvertsActionAttentionFragment.f314200h0.getValue());
                        G0 g02 = G0.f406611a;
                        parentFragmentManager.o0(bundle2, "request_key_user_adverts_attention_dialog_fragment_data");
                        userAdvertsActionAttentionFragment.dismiss();
                        break;
                    default:
                        UserAdvertsActionAttentionFragment.a aVar3 = UserAdvertsActionAttentionFragment.f314199o0;
                        userAdvertsActionAttentionFragment.dismiss();
                        break;
                }
            }
        });
        ScreenPerformanceTracker screenPerformanceTracker4 = this.f314206n0;
        if (screenPerformanceTracker4 == null) {
            screenPerformanceTracker4 = null;
        }
        ScreenPerformanceTracker.a.c(screenPerformanceTracker4, null, null, null, 7);
        return dVar;
    }
}
