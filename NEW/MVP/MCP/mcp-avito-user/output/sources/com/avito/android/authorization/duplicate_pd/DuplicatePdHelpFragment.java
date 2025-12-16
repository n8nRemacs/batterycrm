package com.avito.android.authorization.duplicate_pd;

import Y61.k;
import Y61.l;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.auction.details.i;
import com.avito.android.authorization.duplicate_pd.DuplicatePdArgs;
import com.avito.android.authorization.duplicate_pd.DuplicatePdHelpFragment;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.LinkAttribute;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.text.j;
import java.util.Collections;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: DuplicatePdHelpFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/avito/android/authorization/duplicate_pd/DuplicatePdHelpFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "b", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DuplicatePdHelpFragment extends BaseFragment implements InterfaceC28477j.a {

    /* renamed from: n0, reason: collision with root package name */
    @k
    public static final a f93816n0 = new a(null);

    /* compiled from: DuplicatePdHelpFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/authorization/duplicate_pd/DuplicatePdHelpFragment$a;", "", "<init>", "()V", "", "KEY_PD_HELP_ARGS", "Ljava/lang/String;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: DuplicatePdHelpFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/authorization/duplicate_pd/DuplicatePdHelpFragment$b;", "", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final NavBar f93817a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Button f93818b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final Button f93819c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final TextView f93820d;

        public b(@k View view) {
            this.f93817a = (NavBar) view.findViewById(R.id.pd_duplicate_help_navbar);
            this.f93818b = (Button) view.findViewById(R.id.pd_duplicate_help_forgot_login_button);
            this.f93819c = (Button) view.findViewById(R.id.pd_duplicate_help_changed_number_button);
            TextView textView = (TextView) view.findViewById(R.id.pd_duplicate_help_text_2);
            this.f93820d = textView;
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    /* compiled from: DuplicatePdHelpFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            DuplicatePdHelpFragment.this.requireActivity().onBackPressed();
            return G0.f406611a;
        }
    }

    public DuplicatePdHelpFragment() {
        super(0, 1, null);
    }

    @Override // androidx.fragment.app.Fragment
    @k
    public final View onCreateView(@k LayoutInflater layoutInflater, @l ViewGroup viewGroup, @l Bundle bundle) {
        return layoutInflater.inflate(R.layout.pd_duplicate_help_fragment, viewGroup, false);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@k View view, @l Bundle bundle) {
        final DuplicatePdArgs duplicatePdArgs;
        DuplicatePdArgs.Button button;
        DuplicatePdArgs.Button button2;
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        String str = null;
        if (arguments != null) {
            duplicatePdArgs = (DuplicatePdArgs) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) arguments.getParcelable("key_pd_help_args", DuplicatePdArgs.class) : arguments.getParcelable("key_pd_help_args"));
        } else {
            duplicatePdArgs = null;
        }
        b bVar = new b(view);
        bVar.f93817a.c(R.attr.ic_arrowBack24, new c());
        AttributedText attributedText = new AttributedText(getString(R.string.pd_duplicate_help_text_2), Collections.singletonList(new LinkAttribute("click", getString(R.string.pd_duplicate_help_text_2_click), "", null, 8, null)), 0, 4, null);
        attributedText.setOnUrlClickListener(new i(this, 1));
        j.a(bVar.f93820d, attributedText, null);
        String str2 = (duplicatePdArgs == null || (button2 = duplicatePdArgs.f93812d) == null) ? null : button2.f93814b;
        Button button3 = bVar.f93818b;
        com.avito.android.lib.design.button.b.a(button3, str2, false);
        final int i12 = 0;
        button3.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.authorization.duplicate_pd.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                DuplicatePdArgs.Button button4;
                DuplicatePdArgs.Button button5;
                DuplicatePdHelpFragment duplicatePdHelpFragment = this;
                String str3 = null;
                DuplicatePdArgs duplicatePdArgs2 = duplicatePdArgs;
                switch (i12) {
                    case 0:
                        DuplicatePdHelpFragment.a aVar = DuplicatePdHelpFragment.f93816n0;
                        if (duplicatePdArgs2 != null && (button4 = duplicatePdArgs2.f93812d) != null) {
                            str3 = button4.f93815c;
                        }
                        duplicatePdHelpFragment.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str3)));
                        break;
                    default:
                        DuplicatePdHelpFragment.a aVar2 = DuplicatePdHelpFragment.f93816n0;
                        if (duplicatePdArgs2 != null && (button5 = duplicatePdArgs2.f93813e) != null) {
                            str3 = button5.f93815c;
                        }
                        duplicatePdHelpFragment.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str3)));
                        break;
                }
            }
        });
        if (duplicatePdArgs != null && (button = duplicatePdArgs.f93813e) != null) {
            str = button.f93814b;
        }
        Button button4 = bVar.f93819c;
        com.avito.android.lib.design.button.b.a(button4, str, false);
        final int i13 = 1;
        button4.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.authorization.duplicate_pd.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                DuplicatePdArgs.Button button42;
                DuplicatePdArgs.Button button5;
                DuplicatePdHelpFragment duplicatePdHelpFragment = this;
                String str3 = null;
                DuplicatePdArgs duplicatePdArgs2 = duplicatePdArgs;
                switch (i13) {
                    case 0:
                        DuplicatePdHelpFragment.a aVar = DuplicatePdHelpFragment.f93816n0;
                        if (duplicatePdArgs2 != null && (button42 = duplicatePdArgs2.f93812d) != null) {
                            str3 = button42.f93815c;
                        }
                        duplicatePdHelpFragment.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str3)));
                        break;
                    default:
                        DuplicatePdHelpFragment.a aVar2 = DuplicatePdHelpFragment.f93816n0;
                        if (duplicatePdArgs2 != null && (button5 = duplicatePdArgs2.f93813e) != null) {
                            str3 = button5.f93815c;
                        }
                        duplicatePdHelpFragment.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str3)));
                        break;
                }
            }
        });
    }
}
