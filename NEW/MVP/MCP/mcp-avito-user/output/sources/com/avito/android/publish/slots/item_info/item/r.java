package com.avito.android.publish.slots.item_info.item;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.remote.model.Image;
import com.avito.android.util.C35949t5;
import com.avito.android.util.I5;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ItemInfoItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/slots/item_info/item/r;", "Lcom/avito/android/publish/slots/item_info/item/q;", "Lcom/avito/konveyor/adapter/b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class r extends com.avito.konveyor.adapter.b implements q {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f244401g = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final TextView f244402b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f244403c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f244404d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TextView f244405e;

    /* renamed from: f, reason: collision with root package name */
    public final Context f244406f;

    public r(@Y61.k View view) {
        super(view);
        this.f244402b = (TextView) view.findViewById(R.id.title);
        this.f244403c = (SimpleDraweeView) view.findViewById(R.id.image);
        this.f244404d = (LinearLayout) view.findViewById(R.id.fields);
        this.f244405e = (TextView) view.findViewById(R.id.show_all_parameters);
        this.f244406f = view.getContext();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0012  */
    @Override // com.avito.android.publish.slots.item_info.item.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void TL(@Y61.k java.util.List<com.avito.android.remote.model.category_parameters.slot.item_info.ItemInfoField> r7, @Y61.l java.lang.Integer r8, boolean r9, @Y61.l Y41.a<kotlin.G0> r10) {
        /*
            r6 = this;
            r0 = 0
            if (r8 == 0) goto L12
            int r1 = r7.size()
            int r2 = r8.intValue()
            if (r2 == r1) goto L12
            if (r9 == 0) goto L10
            goto L12
        L10:
            r9 = r0
            goto L13
        L12:
            r9 = 1
        L13:
            if (r9 == 0) goto L16
            goto L27
        L16:
            if (r8 == 0) goto L27
            int r8 = r8.intValue()
            r1 = r7
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.List r8 = kotlin.collections.C42745f0.E0(r1, r8)
            if (r8 != 0) goto L26
            goto L27
        L26:
            r7 = r8
        L27:
            r8 = 0
            android.widget.TextView r1 = r6.f244405e
            if (r9 == 0) goto L33
            com.avito.android.util.D6.w(r1)
            r1.setOnClickListener(r8)
            goto L40
        L33:
            com.avito.android.util.D6.H(r1)
            com.avito.android.profile_settings_extended.adapter.phones.l r9 = new com.avito.android.profile_settings_extended.adapter.phones.l
            r2 = 10
            r9.<init>(r2, r10)
            r1.setOnClickListener(r9)
        L40:
            android.widget.LinearLayout r9 = r6.f244404d
            r9.removeAllViews()
            android.content.Context r10 = r6.f244406f
            android.view.LayoutInflater r10 = android.view.LayoutInflater.from(r10)
            java.util.Iterator r7 = r7.iterator()
        L4f:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L9a
            java.lang.Object r1 = r7.next()
            com.avito.android.remote.model.category_parameters.slot.item_info.ItemInfoField r1 = (com.avito.android.remote.model.category_parameters.slot.item_info.ItemInfoField) r1
            r2 = 2131560917(0x7f0d09d5, float:1.874722E38)
            android.view.View r2 = r10.inflate(r2, r9, r0)
            boolean r3 = r2 instanceof android.widget.LinearLayout
            if (r3 == 0) goto L69
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            goto L6a
        L69:
            r2 = r8
        L6a:
            if (r2 == 0) goto L76
            r3 = 2131366160(0x7f0a1110, float:1.8352206E38)
            android.view.View r3 = r2.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            goto L77
        L76:
            r3 = r8
        L77:
            if (r2 == 0) goto L83
            r4 = 2131366159(0x7f0a110f, float:1.8352204E38)
            android.view.View r4 = r2.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            goto L84
        L83:
            r4 = r8
        L84:
            if (r3 == 0) goto L8d
            java.lang.String r5 = r1.getName()
            com.avito.android.util.I5.a(r3, r5, r0)
        L8d:
            if (r4 == 0) goto L96
            java.lang.String r1 = r1.getValue()
            com.avito.android.util.I5.a(r4, r1, r0)
        L96:
            r9.addView(r2)
            goto L4f
        L9a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.publish.slots.item_info.item.r.TL(java.util.List, java.lang.Integer, boolean, Y41.a):void");
    }

    @Override // com.avito.android.publish.slots.item_info.item.q
    public final void b(@Y61.l String str) {
        I5.a(this.f244402b, str, false);
    }

    @Override // com.avito.android.publish.slots.item_info.item.q
    public final void l(@Y61.k Image image) {
        C35949t5.c(this.f244403c, com.avito.android.image_loader.b.b(image), null, null, null, 14);
    }

    @Override // com.avito.android.publish.slots.item_info.item.q
    public final void p40(boolean z12, boolean z13, @Y61.k Y41.a<G0> aVar) {
        if (z12) {
            this.f244403c.setOnClickListener(new com.avito.android.publish.slots.cpa_ddu_upload.k(4, aVar));
        }
        if (z13) {
            return;
        }
        ((j) aVar).invoke();
    }

    @Override // com.avito.android.publish.slots.item_info.item.q
    public final void n(@Y61.l String str) {
    }
}
