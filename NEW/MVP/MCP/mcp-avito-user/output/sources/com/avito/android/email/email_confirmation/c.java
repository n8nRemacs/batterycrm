package com.avito.android.email.email_confirmation;

import Y61.k;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.nav_bar.NavBar;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: EmailConfirmationView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/email/email_confirmation/c;", "", "_avito_email_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final View f147090a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Resources f147091b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Y41.a<G0> f147092c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f147093d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f147094e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final ImageView f147095f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final ViewGroup f147096g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final ViewGroup f147097h;

    /* compiled from: EmailConfirmationView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            c.this.f147092c.invoke();
            return G0.f406611a;
        }
    }

    public c(@k View view, @k Resources resources, @k Y41.a<G0> aVar) {
        this.f147090a = view;
        this.f147091b = resources;
        this.f147092c = aVar;
        this.f147093d = (TextView) view.findViewById(R.id.email_confirm_placeholder_title);
        this.f147094e = (TextView) view.findViewById(R.id.email_confirm_placeholder_subtitle);
        this.f147095f = (ImageView) view.findViewById(R.id.email_confirm_placeholder_image);
        this.f147096g = (ViewGroup) view.findViewById(R.id.email_confirm_screen_progress_container);
        this.f147097h = (ViewGroup) view.findViewById(R.id.email_confirm_screen_scroll_view);
        ((NavBar) view.findViewById(R.id.email_confirm_screen_toolbar)).c(R.attr.ic_close24, new a());
    }
}
