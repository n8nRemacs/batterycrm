package com.avito.android.authorization.duplicate_pd;

import Y61.k;
import Y61.l;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.advert.item.consultation.B;
import com.avito.android.advertising.adapter.items.buzzoola.media_x2.d;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.FontAttribute;
import com.avito.android.remote.model.text.FontParameter;
import com.avito.android.remote.model.text.FontStyleKt;
import com.avito.android.remote.model.text.LinkAttribute;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.text.j;
import java.util.Collections;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;

/* compiled from: DuplicatePdInfoFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/avito/android/authorization/duplicate_pd/DuplicatePdInfoFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "b", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DuplicatePdInfoFragment extends BaseFragment implements InterfaceC28477j.a {

    /* renamed from: n0, reason: collision with root package name */
    @k
    public static final a f93822n0 = new a(null);

    /* compiled from: DuplicatePdInfoFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/authorization/duplicate_pd/DuplicatePdInfoFragment$a;", "", "<init>", "()V", "", "KEY_LINK", "Ljava/lang/String;", "KEY_PHONE", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: DuplicatePdInfoFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/authorization/duplicate_pd/DuplicatePdInfoFragment$b;", "", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final NavBar f93823a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final TextView f93824b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final Button f93825c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final Button f93826d;

        public b(@k View view) {
            this.f93823a = (NavBar) view.findViewById(R.id.pd_duplicate_info_navbar);
            this.f93824b = (TextView) view.findViewById(R.id.pd_duplicate_info_subtitle);
            this.f93825c = (Button) view.findViewById(R.id.pd_duplicate_info_login);
            this.f93826d = (Button) view.findViewById(R.id.pd_duplicate_info_help);
        }
    }

    /* compiled from: DuplicatePdInfoFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            DuplicatePdInfoFragment.this.requireActivity().finish();
            return G0.f406611a;
        }
    }

    public DuplicatePdInfoFragment() {
        super(0, 1, null);
    }

    @Override // androidx.fragment.app.Fragment
    @k
    public final View onCreateView(@k LayoutInflater layoutInflater, @l ViewGroup viewGroup, @l Bundle bundle) {
        return layoutInflater.inflate(R.layout.pd_duplicate_info_fragment, viewGroup, false);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@k View view, @l Bundle bundle) {
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("KEY_PHONE") : null;
        if (string == null) {
            string = "";
        }
        Bundle arguments2 = getArguments();
        String string2 = arguments2 != null ? arguments2.getString("KEY_LINK") : null;
        String str = string2 == null ? "" : string2;
        b bVar = new b(view);
        bVar.f93823a.c(R.attr.ic_close24, new c());
        int length = string.length();
        TextView textView = bVar.f93824b;
        if (length == 0) {
            j.a(textView, new AttributedText(getString(R.string.pd_duplicate_info_subtitle_without_phone), Collections.singletonList(new LinkAttribute("more", getString(R.string.pd_duplicate_info_subtitle_more), str, null, 8, null)), 0, 4, null), null);
        } else {
            j.a(textView, new AttributedText(getString(R.string.pd_duplicate_info_subtitle_with_phone), C42745f0.U(new FontAttribute("number", string, Collections.singletonList(new FontParameter.StyleParameter(FontStyleKt.BOLD))), new LinkAttribute("more", getString(R.string.pd_duplicate_info_subtitle_more), str, null, 8, null)), 0, 4, null), null);
        }
        bVar.f93825c.setOnClickListener(new d(6, this, string));
        bVar.f93826d.setOnClickListener(new B(this, 22));
    }
}
