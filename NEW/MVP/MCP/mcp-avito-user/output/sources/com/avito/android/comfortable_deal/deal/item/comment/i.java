package com.avito.android.comfortable_deal.deal.item.comment;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import androidx.core.util.y;
import com.avito.android.R;
import com.avito.android.lib.design.avatar.Avatar;
import com.avito.android.remote.model.Image;
import com.avito.android.util.C35829k2;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.ExpandablePanelLayout;
import gw.InterfaceC40743a;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: CommentView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comfortable_deal/deal/item/comment/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/comfortable_deal/deal/item/comment/h;", "b", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: k, reason: collision with root package name */
    public static final DateTimeFormatter f121283k;

    /* renamed from: b, reason: collision with root package name */
    public final Context f121284b;

    /* renamed from: c, reason: collision with root package name */
    public final LayoutInflater f121285c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Avatar f121286d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final ImageView f121287e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f121288f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final TextView f121289g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final LinearLayout f121290h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final y.b f121291i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final ExpandablePanelLayout f121292j;

    /* compiled from: CommentView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/comfortable_deal/deal/item/comment/i$b;", "", "<init>", "()V", "Ljava/time/format/DateTimeFormatter;", "kotlin.jvm.PlatformType", "dateFormatter", "Ljava/time/format/DateTimeFormatter;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    static {
        new b(null);
        f121283k = DateTimeFormatter.ofPattern("d MMMM HH:mm");
    }

    public i(@k View view) {
        super(view);
        Context context = view.getContext();
        this.f121284b = context;
        this.f121285c = LayoutInflater.from(context);
        this.f121286d = (Avatar) view.findViewById(R.id.author_avatar);
        this.f121287e = (ImageView) view.findViewById(R.id.author_avatar_avito);
        this.f121288f = (TextView) view.findViewById(R.id.author_name);
        this.f121289g = (TextView) view.findViewById(R.id.comment_date);
        this.f121290h = (LinearLayout) view.findViewById(R.id.comment_params);
        this.f121291i = new y.b(3);
        ExpandablePanelLayout expandablePanelLayout = (ExpandablePanelLayout) view.findViewById(R.id.comment_container);
        this.f121292j = expandablePanelLayout;
        expandablePanelLayout.setCollapsedLineCount(3);
        expandablePanelLayout.setOnExpandListener(new a());
    }

    @Override // com.avito.android.comfortable_deal.deal.item.comment.h
    public final void J(@k String str) {
        if (str.length() == 0) {
            str = this.f121284b.getString(R.string.comment_author_name_avito);
        }
        this.f121288f.setText(str);
    }

    @Override // com.avito.android.comfortable_deal.deal.item.comment.h
    public final void LV(@k List<e> list) {
        y.b bVar;
        LinearLayout linearLayout = this.f121290h;
        linearLayout.removeAllViews();
        List<e> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        Iterator<T> it = list2.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            bVar = this.f121291i;
            if (!zHasNext) {
                break;
            }
            e eVar = (e) it.next();
            TextView textView = (TextView) bVar.b();
            if (textView == null) {
                textView = (TextView) this.f121285c.inflate(R.layout.deal_item_comment_parameter, (ViewGroup) linearLayout, false);
            }
            String str = eVar.f121280b;
            StringBuilder sbZ = r.z(str, ": ");
            sbZ.append(eVar.f121281c);
            SpannableString spannableString = new SpannableString(sbZ.toString());
            spannableString.setSpan(new ForegroundColorSpan(C35835l0.d(R.attr.gray54, this.f121284b)), 0, str.length() + 1, 17);
            textView.setText(spannableString);
            linearLayout.addView(textView);
            arrayList.add(textView);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            bVar.a((TextView) it2.next());
        }
        D6.G(linearLayout, !list.isEmpty());
    }

    @Override // com.avito.android.comfortable_deal.deal.item.comment.h
    public final void az(@k LocalDateTime localDateTime) {
        this.f121289g.setText(f121283k.format(localDateTime));
    }

    @Override // com.avito.android.comfortable_deal.deal.item.comment.h
    public final void c5(@k String str) {
        ExpandablePanelLayout.b(this.f121292j, str);
    }

    @Override // com.avito.android.comfortable_deal.deal.item.comment.h
    public final void h1(@l Image image) {
        Uri uriD;
        Avatar avatar = this.f121286d;
        if (image != null && (uriD = C35829k2.c(image, avatar, 2, 22).d()) != null && avatar != null) {
            com.bumptech.glide.b.c(avatar).l(uriD).B(new c(avatar));
        }
        D6.G(avatar, image != null);
        D6.G(this.f121287e, image == null);
    }

    /* compiled from: CommentView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/comfortable_deal/deal/item/comment/i$a", "Lcom/avito/android/util/ExpandablePanelLayout$a;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements ExpandablePanelLayout.a {
        @Override // com.avito.android.util.ExpandablePanelLayout.a
        public final void b(@l View view) {
            if (view == null) {
                return;
            }
            view.setVisibility(0);
        }

        @Override // com.avito.android.util.ExpandablePanelLayout.a
        public final void d(@l View view) {
            if (view == null) {
                return;
            }
            view.setVisibility(8);
        }

        @Override // com.avito.android.util.ExpandablePanelLayout.a
        public final void a() {
        }

        @Override // com.avito.android.util.ExpandablePanelLayout.a
        public final void c() {
        }
    }

    /* compiled from: ImageLoadableExtension.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004¸\u0006\u0000"}, d2 = {"DM/l", "Lcom/bumptech/glide/request/target/g;", "Landroid/view/View;", "Landroid/graphics/drawable/Drawable;", "_common_image-loader-glide_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends com.bumptech.glide.request.target.g<View, Drawable> {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ InterfaceC40743a f121293d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(InterfaceC40743a interfaceC40743a) {
            super((View) interfaceC40743a);
            this.f121293d = interfaceC40743a;
        }

        @Override // com.bumptech.glide.request.target.q
        public final void c(Object obj, com.bumptech.glide.request.transition.f fVar) {
            this.f121293d.setImage((Drawable) obj);
        }

        @Override // com.bumptech.glide.request.target.q
        public final void g(@l Drawable drawable) {
        }
    }
}
