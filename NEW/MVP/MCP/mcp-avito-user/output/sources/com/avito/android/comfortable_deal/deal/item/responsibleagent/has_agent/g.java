package com.avito.android.comfortable_deal.deal.item.responsibleagent.has_agent;

import Y61.k;
import Y61.l;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.comfortable_deal.deal.item.agent.h;
import com.avito.android.lib.design.avatar.Avatar;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.Image;
import com.avito.android.util.C35829k2;
import com.avito.android.util.D6;
import gw.InterfaceC40743a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ResponsibleAgentView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/comfortable_deal/deal/item/responsibleagent/has_agent/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/comfortable_deal/deal/item/responsibleagent/has_agent/f;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Avatar f121460b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f121461c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f121462d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Button f121463e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public Y41.a<G0> f121464f;

    public g(@k View view) {
        super(view);
        this.f121460b = (Avatar) view.findViewById(R.id.avatar);
        this.f121461c = (TextView) view.findViewById(R.id.agent_name);
        this.f121462d = (TextView) view.findViewById(R.id.agent_phone);
        Button button = (Button) view.findViewById(R.id.edit_button);
        this.f121463e = button;
        button.setOnClickListener(new h(this, 2));
    }

    @Override // com.avito.android.comfortable_deal.deal.item.responsibleagent.has_agent.f
    public final void J(@k String str) {
        this.f121461c.setText(str);
    }

    @Override // com.avito.android.comfortable_deal.deal.item.responsibleagent.has_agent.f
    public final void JJ(boolean z12) {
        D6.G(this.f121463e, z12);
    }

    @Override // com.avito.android.comfortable_deal.deal.item.responsibleagent.has_agent.f
    public final void h1(@l Image image) {
        Avatar avatar = this.f121460b;
        Uri uriD = C35829k2.c(image, avatar, 2, 22).d();
        if (avatar != null) {
            if (uriD == null) {
                avatar.setImage(null);
            } else {
                com.bumptech.glide.b.c(avatar).l(uriD).B(new a(avatar));
            }
        }
    }

    @Override // com.avito.android.comfortable_deal.deal.item.responsibleagent.has_agent.f
    public final void oA(@k Y41.a<G0> aVar) {
        this.f121464f = aVar;
    }

    @Override // com.avito.android.comfortable_deal.deal.item.responsibleagent.has_agent.f
    public final void q5(@k String str) {
        this.f121462d.setText(str);
    }

    /* compiled from: ImageLoadableExtension.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004¸\u0006\u0000"}, d2 = {"DM/l", "Lcom/bumptech/glide/request/target/g;", "Landroid/view/View;", "Landroid/graphics/drawable/Drawable;", "_common_image-loader-glide_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends com.bumptech.glide.request.target.g<View, Drawable> {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ InterfaceC40743a f121465d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(InterfaceC40743a interfaceC40743a) {
            super((View) interfaceC40743a);
            this.f121465d = interfaceC40743a;
        }

        @Override // com.bumptech.glide.request.target.q
        public final void c(Object obj, com.bumptech.glide.request.transition.f fVar) {
            this.f121465d.setImage((Drawable) obj);
        }

        @Override // com.bumptech.glide.request.target.q
        public final void g(@l Drawable drawable) {
        }
    }
}
