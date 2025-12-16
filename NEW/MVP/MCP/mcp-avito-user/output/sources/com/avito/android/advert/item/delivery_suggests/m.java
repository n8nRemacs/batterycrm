package com.avito.android.advert.item.delivery_suggests;

import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.fresco.SimpleDraweeView;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailsDeliverySuggestsView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/delivery_suggests/m;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert/item/delivery_suggests/j;", "a", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class m extends com.avito.konveyor.adapter.b implements j {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f75120l = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f75121b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f75122c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f75123d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TextView f75124e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final HorizontalScrollView f75125f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final TextView f75126g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f75127h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f75128i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final TextView f75129j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f75130k;

    /* compiled from: AdvertDetailsDeliverySuggestsView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/avito/android/advert/item/delivery_suggests/m$a;", "", "<init>", "()V", "", "ANIMATION_END_OFFSET", "I", "END_MARGIN_SLIDER_ITEM", "TOP_MARGIN_ADDRESS_CENTRICITY", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: AdvertDetailsDeliverySuggestsView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ N f75131l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ DeepLink f75132m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Y41.l<? super DeepLink, G0> lVar, DeepLink deepLink) {
            super(0);
            this.f75131l = (N) lVar;
            this.f75132m = deepLink;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // Y41.a
        public final G0 invoke() {
            this.f75131l.invoke(this.f75132m);
            return G0.f406611a;
        }
    }

    static {
        new a(null);
    }

    public m(@Y61.k View view, @Y61.k com.avito.android.util.text.a aVar) {
        super(view);
        this.f75121b = view;
        this.f75122c = aVar;
        this.f75123d = (TextView) view.findViewById(R.id.delivery_suggests_block_title);
        this.f75124e = (TextView) view.findViewById(R.id.delivery_suggests_block_address_centricity);
        this.f75125f = (HorizontalScrollView) view.findViewById(R.id.delivery_suggests_block_slider);
        this.f75126g = (TextView) view.findViewById(R.id.delivery_suggests_block_description);
        this.f75127h = (LinearLayout) view.findViewById(R.id.delivery_suggests_block_slider_items);
        this.f75128i = (LinearLayout) view.findViewById(R.id.bottom_text_container);
        this.f75129j = (TextView) view.findViewById(R.id.delivery_suggest_bottom_text);
        this.f75130k = (SimpleDraweeView) view.findViewById(R.id.delivery_suggest_bottom_text_icon);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x028b A[PHI: r7
  0x028b: PHI (r7v12 java.lang.Integer) = (r7v4 java.lang.Integer), (r7v13 java.lang.Integer) binds: [B:118:0x0298, B:113:0x0289] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02ab A[PHI: r9
  0x02ab: PHI (r9v18 java.lang.Integer) = (r9v11 java.lang.Integer), (r9v20 java.lang.Integer) binds: [B:129:0x02b8, B:124:0x02a9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02c8 A[PHI: r13
  0x02c8: PHI (r13v14 java.lang.Integer) = (r13v10 java.lang.Integer), (r13v15 java.lang.Integer) binds: [B:140:0x02d5, B:135:0x02c6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x03a6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0247  */
    /* JADX WARN: Type inference failed for: r10v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r13v3, types: [android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams, android.widget.LinearLayout$LayoutParams] */
    /* JADX WARN: Type inference failed for: r1v30, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [int] */
    /* JADX WARN: Type inference failed for: r4v8 */
    @Override // com.avito.android.advert.item.delivery_suggests.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Lh(@Y61.k com.avito.android.remote.delivery_suggests.DeliverySuggests r31, @Y61.l java.lang.String r32, boolean r33, @Y61.k Y41.l<? super com.avito.android.deep_linking.links.DeepLink, kotlin.G0> r34, @Y61.k Y41.p<? super com.avito.android.deep_linking.links.DeepLink, ? super java.lang.String, kotlin.G0> r35) {
        /*
            Method dump skipped, instructions count: 1084
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert.item.delivery_suggests.m.Lh(com.avito.android.remote.delivery_suggests.DeliverySuggests, java.lang.String, boolean, Y41.l, Y41.p):void");
    }
}
