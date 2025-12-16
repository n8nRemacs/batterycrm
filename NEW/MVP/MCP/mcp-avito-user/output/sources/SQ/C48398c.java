package sq;

import Y61.k;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.util.C35835l0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SubmittingSuccessView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lsq/c;", "Lsq/a;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: sq.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C48398c implements InterfaceC48396a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Y41.a<G0> f438871a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Y41.a<G0> f438872b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Y41.a<G0> f438873c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f438874d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final ImageView f438875e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f438876f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final TextView f438877g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final Button f438878h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final Button f438879i;

    public C48398c(@k View view, @k Y41.a<G0> aVar, @k Y41.a<G0> aVar2, @k Y41.a<G0> aVar3) {
        this.f438871a = aVar;
        this.f438872b = aVar2;
        this.f438873c = aVar3;
        this.f438874d = view.getContext();
        View viewFindViewById = view.findViewById(R.id.toolbar);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.appcompat.widget.Toolbar");
        }
        Toolbar toolbar = (Toolbar) viewFindViewById;
        this.f438875e = (ImageView) view.findViewById(R.id.image);
        this.f438876f = (TextView) view.findViewById(R.id.title);
        this.f438877g = (TextView) view.findViewById(R.id.subtitle);
        Button button = (Button) view.findViewById(R.id.button_proceed);
        this.f438878h = button;
        Button button2 = (Button) view.findViewById(R.id.button_details);
        this.f438879i = button2;
        final int i12 = 0;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: sq.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ C48398c f438870c;

            {
                this.f438870c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i12) {
                    case 0:
                        this.f438870c.f438871a.invoke();
                        break;
                    case 1:
                        this.f438870c.f438872b.invoke();
                        break;
                    default:
                        this.f438870c.f438873c.invoke();
                        break;
                }
            }
        });
        final int i13 = 1;
        button2.setOnClickListener(new View.OnClickListener(this) { // from class: sq.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ C48398c f438870c;

            {
                this.f438870c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i13) {
                    case 0:
                        this.f438870c.f438871a.invoke();
                        break;
                    case 1:
                        this.f438870c.f438872b.invoke();
                        break;
                    default:
                        this.f438870c.f438873c.invoke();
                        break;
                }
            }
        });
        toolbar.setNavigationIcon(C35835l0.h(R.attr.ic_close24, toolbar.getContext()));
        Drawable navigationIcon = toolbar.getNavigationIcon();
        if (navigationIcon != null) {
            navigationIcon.setTintList(C35835l0.e(R.attr.black, toolbar.getContext()));
        }
        final int i14 = 2;
        toolbar.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: sq.b

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ C48398c f438870c;

            {
                this.f438870c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i14) {
                    case 0:
                        this.f438870c.f438871a.invoke();
                        break;
                    case 1:
                        this.f438870c.f438872b.invoke();
                        break;
                    default:
                        this.f438870c.f438873c.invoke();
                        break;
                }
            }
        });
    }
}
