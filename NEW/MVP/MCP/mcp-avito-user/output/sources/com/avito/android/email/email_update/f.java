package com.avito.android.email.email_update;

import Y41.l;
import Y61.k;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.nav_bar.NavBar;
import kd0.C42670a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: EmailUpdateView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/email/email_update/f;", "", "_avito_email_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final View f147191a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Y41.a<G0> f147192b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final l<String, G0> f147193c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Y41.a<G0> f147194d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final ComponentContainer f147195e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Input f147196f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final Button f147197g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final ViewGroup f147198h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final TextView f147199i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final C42670a f147200j;

    /* compiled from: EmailUpdateView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            f.this.f147192b.invoke();
            return G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(@k View view, @k Resources resources, @k Y41.a<G0> aVar, @k l<? super String, G0> lVar, @k Y41.a<G0> aVar2) {
        this.f147191a = view;
        this.f147192b = aVar;
        this.f147193c = lVar;
        this.f147194d = aVar2;
        NavBar navBar = (NavBar) view.findViewById(R.id.email_update_screen_toolbar);
        this.f147195e = (ComponentContainer) view.findViewById(R.id.email_update_screen_input_container);
        this.f147196f = (Input) view.findViewById(R.id.email_update_screen_input);
        this.f147197g = (Button) view.findViewById(R.id.email_update_screen_save_button);
        this.f147198h = (ViewGroup) view.findViewById(R.id.email_update_screen_verification_text_container);
        this.f147199i = (TextView) view.findViewById(R.id.email_update_screen_verification_text_view);
        this.f147200j = new C42670a((ViewGroup) view.findViewById(R.id.email_update_screen_progress_overlay), null, 0, 6, null);
        NavBar.e(navBar, resources.getString(R.string.email_update_screen_title), 0, 6);
        navBar.c(R.attr.ic_close24, new a());
    }
}
