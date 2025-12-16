package com.avito.android.sbc.autodispatcheslist.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.badge.Badge;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.description_list.parameter_line.item.DescriptionParameterItem;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SbcAutoDispatchItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/sbc/autodispatcheslist/adapter/n;", "LTV0/e;", "Lcom/avito/konveyor/adapter/b;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class n extends com.avito.konveyor.adapter.b implements TV0.e {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f259067t = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f259068b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f259069c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f259070d;

    /* renamed from: e, reason: collision with root package name */
    public final Badge f259071e;

    /* renamed from: f, reason: collision with root package name */
    public final Badge f259072f;

    /* renamed from: g, reason: collision with root package name */
    public final ImageView f259073g;

    /* renamed from: h, reason: collision with root package name */
    public final TextView f259074h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f259075i;

    /* renamed from: j, reason: collision with root package name */
    public final ViewGroup f259076j;

    /* renamed from: k, reason: collision with root package name */
    public final TextView f259077k;

    /* renamed from: l, reason: collision with root package name */
    public final DescriptionParameterItem f259078l;

    /* renamed from: m, reason: collision with root package name */
    public final DescriptionParameterItem f259079m;

    /* renamed from: n, reason: collision with root package name */
    public final DescriptionParameterItem f259080n;

    /* renamed from: o, reason: collision with root package name */
    public final DescriptionParameterItem f259081o;

    /* renamed from: p, reason: collision with root package name */
    public final Button f259082p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final b f259083q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final b f259084r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final b f259085s;

    /* compiled from: SbcAutoDispatchItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[DispatchViewStatus.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                DispatchViewStatus dispatchViewStatus = DispatchViewStatus.f259023b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                DispatchViewStatus dispatchViewStatus2 = DispatchViewStatus.f259023b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public n(@Y61.k View view, boolean z12) {
        super(view);
        this.f259068b = view;
        this.f259069c = z12;
        this.f259070d = (TextView) view.findViewById(R.id.sbc_auto_dispatches_list_item_title);
        this.f259071e = (Badge) view.findViewById(R.id.sbc_auto_dispatches_list_item_status_active);
        this.f259072f = (Badge) view.findViewById(R.id.sbc_auto_dispatches_list_item_status_planned);
        this.f259073g = (ImageView) view.findViewById(R.id.sbc_auto_dispatches_list_item_expand_icon);
        this.f259074h = (TextView) view.findViewById(R.id.sbc_auto_dispatches_list_item_duration);
        this.f259075i = (TextView) view.findViewById(R.id.sbc_auto_dispatches_list_items_count);
        this.f259076j = (ViewGroup) view.findViewById(R.id.sbc_auto_dispatches_item_advert_entries_container);
        this.f259077k = (TextView) view.findViewById(R.id.sbc_auto_dispatches_list_items_extra_adverts_count);
        this.f259078l = (DescriptionParameterItem) view.findViewById(R.id.sbc_auto_dispatches_list_recipients);
        this.f259079m = (DescriptionParameterItem) view.findViewById(R.id.sbc_auto_dispatches_list_created_chats);
        this.f259080n = (DescriptionParameterItem) view.findViewById(R.id.sbc_auto_dispatches_list_budget);
        this.f259081o = (DescriptionParameterItem) view.findViewById(R.id.sbc_auto_dispatches_list_expenses);
        this.f259082p = (Button) view.findViewById(R.id.sbc_auto_dispatches_edit_button);
        this.f259083q = new b(view.findViewById(R.id.sbc_auto_dispatch_list_item_advert_entry_1));
        this.f259084r = new b(view.findViewById(R.id.sbc_auto_dispatch_list_item_advert_entry_2));
        this.f259085s = new b(view.findViewById(R.id.sbc_auto_dispatch_list_item_advert_entry_3));
    }
}
