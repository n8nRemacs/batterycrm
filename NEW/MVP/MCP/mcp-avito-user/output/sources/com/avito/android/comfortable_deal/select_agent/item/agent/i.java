package com.avito.android.comfortable_deal.select_agent.item.agent;

import Y61.k;
import Y61.l;
import android.net.Uri;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.image_loader.fresco.s;
import com.avito.android.lib.design.avatar.Avatar;
import com.avito.android.lib.design.toggle.RadioButton;
import com.avito.android.remote.model.Image;
import com.avito.android.util.C35829k2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AgentView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/comfortable_deal/select_agent/item/agent/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/comfortable_deal/select_agent/item/agent/g;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class i extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f122727b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f122728c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f122729d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Avatar f122730e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final RadioButton f122731f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public Y41.a<G0> f122732g;

    public i(@k View view) {
        super(view);
        this.f122727b = view;
        View viewFindViewById = view.findViewById(R.id.agent_name);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f122728c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.agent_phone_number);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f122729d = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.agent_avatar);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.avatar.Avatar");
        }
        this.f122730e = (Avatar) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.agent_select);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.toggle.RadioButton");
        }
        RadioButton radioButton = (RadioButton) viewFindViewById4;
        this.f122731f = radioButton;
        final int i12 = 0;
        view.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.comfortable_deal.select_agent.item.agent.h

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ i f122726c;

            {
                this.f122726c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i12) {
                    case 0:
                        Y41.a<G0> aVar = this.f122726c.f122732g;
                        if (aVar != null) {
                            aVar.invoke();
                            break;
                        }
                        break;
                    default:
                        Y41.a<G0> aVar2 = this.f122726c.f122732g;
                        if (aVar2 != null) {
                            aVar2.invoke();
                            break;
                        }
                        break;
                }
            }
        });
        final int i13 = 1;
        radioButton.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.comfortable_deal.select_agent.item.agent.h

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ i f122726c;

            {
                this.f122726c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i13) {
                    case 0:
                        Y41.a<G0> aVar = this.f122726c.f122732g;
                        if (aVar != null) {
                            aVar.invoke();
                            break;
                        }
                        break;
                    default:
                        Y41.a<G0> aVar2 = this.f122726c.f122732g;
                        if (aVar2 != null) {
                            aVar2.invoke();
                            break;
                        }
                        break;
                }
            }
        });
    }

    @Override // com.avito.android.comfortable_deal.select_agent.item.agent.g
    public final void F1(@k String str) {
        this.f122728c.setText(str);
    }

    @Override // com.avito.android.comfortable_deal.select_agent.item.agent.g
    public final void Ic(@l Image image) {
        Avatar avatar = this.f122730e;
        Uri uriD = C35829k2.c(image, avatar, 2, 22).d();
        if (uriD != null) {
            s.c(avatar, uriD, true, null, null);
        }
    }

    @Override // com.avito.android.comfortable_deal.select_agent.item.agent.g
    public final void a(@k Y41.a<G0> aVar) {
        this.f122732g = aVar;
    }

    @Override // com.avito.android.comfortable_deal.select_agent.item.agent.g
    public final void b5(@k String str) {
        this.f122729d.setText(str);
    }

    @Override // com.avito.android.comfortable_deal.select_agent.item.agent.g
    public final void hb(boolean z12) {
        RadioButton radioButton = this.f122731f;
        if (radioButton.isChecked() == z12) {
            return;
        }
        radioButton.setChecked(z12);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f122732g = null;
    }

    @Override // com.avito.android.comfortable_deal.select_agent.item.agent.g
    public final void setEnabled(boolean z12) {
        this.f122731f.setEnabled(z12);
        this.f122727b.setEnabled(z12);
    }
}
