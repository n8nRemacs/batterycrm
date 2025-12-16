package com.avito.android.service_orders.list.blueprints.snippet_item;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.foundation.H;
import com.avito.android.B2;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.serp.adapter.serp_advert_card.A;
import com.avito.android.service_orders.list.blueprints.ServiceOrdersListSnippetItem;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;

/* compiled from: ServiceOrdersListSnippetViewHolder.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_orders/list/blueprints/snippet_item/m;", "Lcom/avito/konveyor/adapter/b;", "LTV0/e;", "a", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class m extends com.avito.konveyor.adapter.b implements TV0.e {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f279352m = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final B2 f279353b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f279354c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final androidx.asynclayoutinflater.view.a f279355d;

    /* renamed from: e, reason: collision with root package name */
    public final LayoutInflater f279356e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f279357f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f279358g;

    /* renamed from: h, reason: collision with root package name */
    public final ViewGroup f279359h;

    /* renamed from: i, reason: collision with root package name */
    public final Button f279360i;

    /* renamed from: j, reason: collision with root package name */
    public final Button f279361j;

    /* renamed from: k, reason: collision with root package name */
    public final ViewGroup f279362k;

    /* renamed from: l, reason: collision with root package name */
    public final TextView f279363l;

    /* compiled from: ServiceOrdersListSnippetViewHolder.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/avito/android/service_orders/list/blueprints/snippet_item/m$a;", "", "<init>", "()V", "", "CONTACT_NAME_TAG", "Ljava/lang/String;", "CONTACT_PHONE_TAG", "CONTACT_TAG", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ServiceOrdersListSnippetViewHolder.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f279364a;

        static {
            int[] iArr = new int[ServiceOrdersListSnippetItem.Status.values().length];
            try {
                ServiceOrdersListSnippetItem.Status status = ServiceOrdersListSnippetItem.Status.f279241b;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ServiceOrdersListSnippetItem.Status status2 = ServiceOrdersListSnippetItem.Status.f279241b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ServiceOrdersListSnippetItem.Status status3 = ServiceOrdersListSnippetItem.Status.f279241b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f279364a = iArr;
        }
    }

    static {
        new a(null);
    }

    public m(@Y61.k View view, @Y61.k B2 b22) {
        super(view);
        this.f279353b = b22;
        this.f279354c = view.getContext();
        this.f279355d = new androidx.asynclayoutinflater.view.a(view.getContext());
        this.f279356e = LayoutInflater.from(view.getContext());
        this.f279357f = (TextView) view.findViewById(R.id.srv_order_snippet_title);
        this.f279358g = (TextView) view.findViewById(R.id.srv_order_snippet_status);
        this.f279359h = (ViewGroup) view.findViewById(R.id.srv_order_snippet_price_list);
        this.f279360i = (Button) view.findViewById(R.id.srv_order_snippet_more_btn);
        this.f279361j = (Button) view.findViewById(R.id.srv_order_snippet_action_btn);
        this.f279362k = (ViewGroup) view.findViewById(R.id.orders_contacts_root);
        this.f279363l = (TextView) view.findViewById(R.id.srv_order_comment_text);
    }

    public final void B80(@Y61.k Y41.l lVar, @Y61.l ArrayList arrayList) throws InterruptedException {
        String string;
        ViewGroup viewGroup = this.f279362k;
        viewGroup.removeAllViews();
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ServiceOrdersListSnippetItem.a aVar = (ServiceOrdersListSnippetItem.a) it.next();
                B2 b22 = this.f279353b;
                b22.getClass();
                n<Object> nVar = B2.f67184X[19];
                if (((Boolean) b22.f67227u.a().invoke()).booleanValue()) {
                    boolean z12 = false;
                    View viewInflate = this.f279356e.inflate(R.layout.service_orders_list_item_contact_new_block, viewGroup, false);
                    View viewFindViewById = viewInflate.findViewById(R.id.srv_order_snippet_user_description);
                    if (viewFindViewById == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                    }
                    TextView textView = (TextView) viewFindViewById;
                    String str = aVar.f279248b;
                    if (str != null) {
                        StringBuilder sbR = H.r(str);
                        sbR.append(this.f279354c.getString(R.string.srv_orders_list_contact_separator));
                        string = sbR.toString();
                    } else {
                        string = null;
                    }
                    I5.a(textView, string, false);
                    View viewFindViewById2 = viewInflate.findViewById(R.id.srv_order_snippet_user_name);
                    if (viewFindViewById2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                    }
                    TextView textView2 = (TextView) viewFindViewById2;
                    textView2.setTag("contact_name");
                    I5.a(textView2, aVar.f279247a, false);
                    View viewFindViewById3 = viewInflate.findViewById(R.id.srv_order_snippet_contact_phone);
                    if (viewFindViewById3 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                    }
                    TextView textView3 = (TextView) viewFindViewById3;
                    textView3.setTag("contact_phone");
                    String str2 = aVar.f279249c;
                    I5.a(textView3, str2, false);
                    View viewFindViewById4 = viewInflate.findViewById(R.id.srv_order_snippet_contact_show_phone_text);
                    if (viewFindViewById4 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                    }
                    TextView textView4 = (TextView) viewFindViewById4;
                    String str3 = aVar.f279250d;
                    I5.a(textView4, str3, false);
                    textView4.setPaintFlags(textView4.getPaintFlags() | 8);
                    View viewFindViewById5 = viewInflate.findViewById(R.id.srv_order_snippet_contact_phone_copy);
                    if (viewFindViewById5 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                    }
                    TextView textView5 = (TextView) viewFindViewById5;
                    if (str3 == null && str2 != null && str2.length() != 0) {
                        z12 = true;
                    }
                    D6.G(textView5, z12);
                    if (aVar.f279252f) {
                        viewInflate.setOnClickListener(new com.avito.android.service_booking_calendar.flexible.header.toolbar.g(lVar, aVar));
                    } else {
                        viewInflate.setOnClickListener(null);
                    }
                    viewGroup.addView(viewInflate);
                } else {
                    this.f279355d.a(R.layout.service_orders_list_item_contact, viewGroup, new com.avito.android.gig_shift_action.ui.a(5, aVar, this));
                }
            }
        }
    }

    public final void C80(@Y61.l Y41.a<G0> aVar) {
        View[] viewArr = {this.f279357f, this.f279358g, this.f279359h, this.f279362k};
        for (int i12 = 0; i12 < 4; i12++) {
            viewArr[i12].setOnClickListener(new A(10, aVar));
        }
    }

    public final void D80(@Y61.l String str, @Y61.l ServiceOrdersListSnippetItem.Status status, @Y61.l AttributedText attributedText) {
        TextView textView = this.f279358g;
        if (attributedText != null) {
            com.avito.android.util.text.j.a(textView, attributedText, null);
            return;
        }
        I5.a(textView, str, false);
        int i12 = b.f279364a[status.ordinal()];
        Context context = this.f279354c;
        textView.setTextColor(i12 != 1 ? i12 != 2 ? i12 != 3 ? C35835l0.d(R.attr.black, context) : C35835l0.d(R.attr.red700, context) : C35835l0.d(R.attr.green700, context) : C35835l0.d(R.attr.orange800, context));
    }
}
