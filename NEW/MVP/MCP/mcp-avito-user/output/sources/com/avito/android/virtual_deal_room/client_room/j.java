package com.avito.android.virtual_deal_room.client_room;

import EN0.a;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.akita.view.component.pull_to_refresh.PullToRefresh;
import com.avito.android.R;
import com.avito.android.bottom_navigation.ViewOnLongClickListenerC28892n;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.tab_group.TabGroup;
import com.avito.android.util.D6;
import com.avito.android.virtual_deal_room.client_room.view.CategoryBottomSheetBehavior;
import java.lang.ref.WeakReference;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ClientRoomView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/virtual_deal_room/client_room/j;", "Lcom/avito/android/virtual_deal_room/client_room/g;", "_avito_virtual-deal-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class j implements g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Y41.l<EN0.a, G0> f326316a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f326317b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final View f326318c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final View f326319d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final ImageView f326320e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final ImageButton f326321f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final ImageButton f326322g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final TextView f326323h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final TextView f326324i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final TabGroup f326325j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final PullToRefresh f326326k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f326327l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f326328m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public Uri f326329n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public WeakReference<zN0.c> f326330o;

    /* compiled from: ClientRoomView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<Integer> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final Integer invoke() {
            j jVar = j.this;
            return Integer.valueOf(jVar.f326326k.getHeight() - D6.i(8, jVar.f326327l.getContext()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j(@Y61.k View view, @Y61.k Y41.l<? super EN0.a, G0> lVar) {
        this.f326316a = lVar;
        View viewFindViewById = view.findViewById(R.id.category_error);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f326317b = viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.category_loading);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f326318c = viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.category_content);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f326319d = viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.icon_back_content);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageButton");
        }
        ImageButton imageButton = (ImageButton) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.user_avatar);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f326320e = (ImageView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.icon_phone);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageButton");
        }
        ImageButton imageButton2 = (ImageButton) viewFindViewById6;
        this.f326321f = imageButton2;
        View viewFindViewById7 = view.findViewById(R.id.icon_edit);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageButton");
        }
        ImageButton imageButton3 = (ImageButton) viewFindViewById7;
        this.f326322g = imageButton3;
        View viewFindViewById8 = view.findViewById(R.id.user_name);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f326323h = (TextView) viewFindViewById8;
        View viewFindViewById9 = view.findViewById(R.id.user_phone);
        if (viewFindViewById9 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById9;
        this.f326324i = textView;
        View viewFindViewById10 = view.findViewById(R.id.tabs_categories);
        if (viewFindViewById10 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.tab_group.TabGroup");
        }
        this.f326325j = (TabGroup) viewFindViewById10;
        View viewFindViewById11 = view.findViewById(R.id.category_pull_refresh);
        if (viewFindViewById11 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.akita.view.component.pull_to_refresh.PullToRefresh");
        }
        this.f326326k = (PullToRefresh) viewFindViewById11;
        View viewFindViewById12 = view.findViewById(R.id.category_container);
        if (viewFindViewById12 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        this.f326327l = (ViewGroup) viewFindViewById12;
        this.f326328m = C42727D.c(new a());
        View viewFindViewById13 = viewFindViewById.findViewById(R.id.update_button);
        if (viewFindViewById13 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        final int i12 = 0;
        ((Button) viewFindViewById13).setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.virtual_deal_room.client_room.h

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ j f326286c;

            {
                this.f326286c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i12) {
                    case 0:
                        this.f326286c.f326316a.invoke(a.h.f3952a);
                        break;
                    case 1:
                        this.f326286c.f326316a.invoke(a.c.f3947a);
                        break;
                    case 2:
                        this.f326286c.f326316a.invoke(a.c.f3947a);
                        break;
                    case 3:
                        this.f326286c.f326316a.invoke(a.C0229a.f3945a);
                        break;
                    default:
                        this.f326286c.f326316a.invoke(a.d.f3948a);
                        break;
                }
            }
        });
        View viewFindViewById14 = viewFindViewById.findViewById(R.id.icon_back_error);
        if (viewFindViewById14 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        final int i13 = 1;
        ((ImageView) viewFindViewById14).setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.virtual_deal_room.client_room.h

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ j f326286c;

            {
                this.f326286c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i13) {
                    case 0:
                        this.f326286c.f326316a.invoke(a.h.f3952a);
                        break;
                    case 1:
                        this.f326286c.f326316a.invoke(a.c.f3947a);
                        break;
                    case 2:
                        this.f326286c.f326316a.invoke(a.c.f3947a);
                        break;
                    case 3:
                        this.f326286c.f326316a.invoke(a.C0229a.f3945a);
                        break;
                    default:
                        this.f326286c.f326316a.invoke(a.d.f3948a);
                        break;
                }
            }
        });
        final int i14 = 2;
        imageButton.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.virtual_deal_room.client_room.h

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ j f326286c;

            {
                this.f326286c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i14) {
                    case 0:
                        this.f326286c.f326316a.invoke(a.h.f3952a);
                        break;
                    case 1:
                        this.f326286c.f326316a.invoke(a.c.f3947a);
                        break;
                    case 2:
                        this.f326286c.f326316a.invoke(a.c.f3947a);
                        break;
                    case 3:
                        this.f326286c.f326316a.invoke(a.C0229a.f3945a);
                        break;
                    default:
                        this.f326286c.f326316a.invoke(a.d.f3948a);
                        break;
                }
            }
        });
        final int i15 = 3;
        imageButton2.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.virtual_deal_room.client_room.h

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ j f326286c;

            {
                this.f326286c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i15) {
                    case 0:
                        this.f326286c.f326316a.invoke(a.h.f3952a);
                        break;
                    case 1:
                        this.f326286c.f326316a.invoke(a.c.f3947a);
                        break;
                    case 2:
                        this.f326286c.f326316a.invoke(a.c.f3947a);
                        break;
                    case 3:
                        this.f326286c.f326316a.invoke(a.C0229a.f3945a);
                        break;
                    default:
                        this.f326286c.f326316a.invoke(a.d.f3948a);
                        break;
                }
            }
        });
        final int i16 = 4;
        imageButton3.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.virtual_deal_room.client_room.h

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ j f326286c;

            {
                this.f326286c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i16) {
                    case 0:
                        this.f326286c.f326316a.invoke(a.h.f3952a);
                        break;
                    case 1:
                        this.f326286c.f326316a.invoke(a.c.f3947a);
                        break;
                    case 2:
                        this.f326286c.f326316a.invoke(a.c.f3947a);
                        break;
                    case 3:
                        this.f326286c.f326316a.invoke(a.C0229a.f3945a);
                        break;
                    default:
                        this.f326286c.f326316a.invoke(a.d.f3948a);
                        break;
                }
            }
        });
        textView.setOnLongClickListener(new ViewOnLongClickListenerC28892n(this, i16));
        b().f326419h0 = new i(this);
    }

    public static final int a(j jVar, boolean z12) {
        if (!z12) {
            return ((Number) jVar.f326328m.getValue()).intValue();
        }
        int height = jVar.f326326k.getHeight();
        TabGroup tabGroup = jVar.f326325j;
        return (height - tabGroup.getHeight()) - D6.i(16, tabGroup.getContext());
    }

    public final CategoryBottomSheetBehavior<View> b() {
        return (CategoryBottomSheetBehavior) ((CoordinatorLayout.g) this.f326327l.getLayoutParams()).f44447a;
    }
}
