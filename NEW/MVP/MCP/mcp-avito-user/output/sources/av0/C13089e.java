package Av0;

import Au.ViewOnClickListenerC13080b;
import Y41.l;
import Y61.k;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.util.C35829k2;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import com.facebook.drawee.drawable.s;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: ServiceTransportationCardSelectItemsAdapter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"LAv0/e;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "LAv0/e$a;", "a", "_avito_service-transportation-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Av0.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13089e extends RecyclerView.Adapter<a> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public final l<C13088d, G0> f686c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public Object f687d = C42784z0.f406748b;

    /* compiled from: ServiceTransportationCardSelectItemsAdapter.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LAv0/e$a;", "Landroidx/recyclerview/widget/RecyclerView$C;", "a", "_avito_service-transportation-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Av0.e$a */
    public static final class a extends RecyclerView.C {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final View f688b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final ViewGroup f689c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final TextView f690d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final TextView f691e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final TextView f692f;

        /* renamed from: g, reason: collision with root package name */
        @k
        public final SimpleDraweeView f693g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.l
        public C13088d f694h;

        /* compiled from: ServiceTransportationCardSelectItemsAdapter.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LAv0/e$a$a;", "", "<init>", "()V", "", "DEFAULT_IMAGE_MAX_HEIGHT", "I", "_avito_service-transportation-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Av0.e$a$a, reason: collision with other inner class name */
        public static final class C0027a {
            public /* synthetic */ C0027a(C42822w c42822w) {
                this();
            }

            public C0027a() {
            }
        }

        static {
            new C0027a(null);
        }

        public a(@k View view) {
            super(view);
            this.f688b = view;
            this.f689c = (ViewGroup) view.findViewById(R.id.selectContainer);
            this.f690d = (TextView) view.findViewById(R.id.selectText);
            this.f691e = (TextView) view.findViewById(R.id.selectDescription);
            this.f692f = (TextView) view.findViewById(R.id.selectLabel);
            this.f693g = (SimpleDraweeView) view.findViewById(R.id.selectImage);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C13089e(@k l<? super C13088d, G0> lVar) {
        this.f686c = lVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f687d.size();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i12) {
        return ((C13088d) this.f687d.get(i12)).f682d;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.C c12, int i12) {
        a aVar = (a) c12;
        C13088d c13088d = (C13088d) this.f687d.get(i12);
        C13088d c13088d2 = aVar.f694h;
        if (!new com.avito.android.lib.util.c(c13088d, c13088d2).f181333c) {
            String str = c13088d2 != null ? c13088d2.f679a : null;
            String str2 = c13088d.f679a;
            if (!new com.avito.android.lib.util.c(str2, str).f181333c && str2 != null) {
                I5.a(aVar.f690d, str2, false);
            }
            String str3 = c13088d2 != null ? c13088d2.f680b : null;
            String str4 = c13088d.f680b;
            if (!new com.avito.android.lib.util.c(str4, str3).f181333c && str4 != null) {
                I5.a(aVar.f691e, str4, false);
            }
            String str5 = c13088d2 != null ? c13088d2.f681c : null;
            String str6 = c13088d.f681c;
            if (!new com.avito.android.lib.util.c(str6, str5).f181333c && str6 != null) {
                I5.a(aVar.f692f, str6, false);
            }
            boolean z12 = c13088d.f685g;
            if (!new com.avito.android.lib.util.c(Boolean.valueOf(z12), c13088d2 != null ? Boolean.valueOf(c13088d2.f685g) : null).f181333c) {
                aVar.f689c.setSelected(z12);
            }
            UniversalImage universalImage = c13088d2 != null ? c13088d2.f683e : null;
            UniversalImage universalImage2 = c13088d.f683e;
            boolean z13 = new com.avito.android.lib.util.c(universalImage2, universalImage).f181333c;
            SimpleDraweeView simpleDraweeView = aVar.f693g;
            if (!z13 && universalImage2 != null) {
                simpleDraweeView.setVisibility(0);
                simpleDraweeView.e(C35829k2.c(UniversalImageKt.getImageDependsOnTheme(universalImage2, com.avito.android.lib.util.darkTheme.c.b(aVar.f688b.getContext())), simpleDraweeView, 1, 22).d());
            }
            Long l12 = c13088d2 != null ? c13088d2.f684f : null;
            Long l13 = c13088d.f684f;
            if (!new com.avito.android.lib.util.c(l13, l12).f181333c && l13 != null) {
                simpleDraweeView.getLayoutParams().height = y6.b((int) l13.longValue());
                simpleDraweeView.getHierarchy().n(s.c.f340133e);
                simpleDraweeView.requestLayout();
            }
        }
        aVar.f694h = c13088d;
        aVar.itemView.setOnClickListener(new ViewOnClickListenerC13080b(1, this, c13088d));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.C onCreateViewHolder(ViewGroup viewGroup, int i12) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.service_transportation_widget_card_select_sheet_item, viewGroup, false);
        viewInflate.setClipToOutline(true);
        return new a(viewInflate);
    }
}
