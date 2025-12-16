package com.avito.android.user_adverts_views_pub;

import TV0.e;
import Y61.k;
import Y61.l;
import Zx.C19616a;
import android.view.View;
import android.widget.LinearLayout;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.user_adverts_views_pub.UserAdvertItem;
import j.InterfaceC42150f;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: UserAdvertItemView.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_adverts_views_pub/c;", "LTV0/e;", "b", "Lcom/avito/android/user_adverts_views_pub/c$b;", "_avito_user-adverts-views_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface c extends e {

    /* compiled from: UserAdvertItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    /* compiled from: UserAdvertItemView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_adverts_views_pub/c$b;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/user_adverts_views_pub/c;", "_avito_user-adverts-views_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b extends com.avito.konveyor.adapter.b implements c {
        public abstract void B80(@l UserAdvertItem.b bVar, @k Y41.a<G0> aVar);

        public abstract void C80(@l UserAdvertItem.a aVar, @k Y41.l<? super Boolean, G0> lVar);

        public abstract void D80(@l String str);

        public abstract void E80(@l UserAdvertItem.j jVar, @l UserAdvertItem.k kVar, @l UserAdvertItem.g gVar);

        public abstract void F80(@l UserAdvertItem.e eVar, @k C19616a c19616a);

        public abstract void G80(@l String str);

        public abstract void H80(boolean z12);

        public abstract void I80(@l String str, boolean z12, boolean z13);

        public abstract void J80(@l String str, @l UserAdvertItem.c cVar);

        @Override // com.avito.android.user_adverts_views_pub.c
        @k
        public final View JE() {
            return this.itemView;
        }

        public abstract void K80(@k Y41.a aVar, @l String str, @l String str2);

        public abstract void L80(@l UserAdvertItem.Status status);

        public abstract void M80(@l AttributedText attributedText, @l String str);

        public abstract void N80(@l String str);

        public abstract void O80(@l UserAdvertItem.RightAction rightAction, @l DeepLink deepLink, @k Y41.l<? super DeepLink, G0> lVar, @k Y41.l<? super UserAdvertItem.RightAction, G0> lVar2);

        public abstract void P80(@l Map<String, Image> map, @l UserAdvertItem.m mVar, @k Y41.a<G0> aVar, @l UserAdvertItem.CpxPromoWidget cpxPromoWidget, @k Y41.l<? super DeepLink, G0> lVar);

        public abstract void Q80(@l String str);

        public abstract void R80(@l AttributedText attributedText);

        public abstract void S(@k Y41.a<G0> aVar);

        public abstract void S80(@l UserAdvertItem.p pVar);

        public abstract void T80(@k String str, boolean z12, @l String str2, @l String str3, @l AttributedText attributedText, @l UserAdvertItem.i iVar, @l UserAdvertItem.l lVar, @l UserAdvertItem.t tVar);

        public abstract void U80(@l UserAdvertItem.r rVar, @k Y41.a<G0> aVar);

        public abstract void V80(@InterfaceC42150f @l Integer num, @l String str);

        public abstract void b(@k String str);

        public abstract void z1(@l Image image);
    }

    @k
    LinearLayout DR();

    @k
    View JE();
}
