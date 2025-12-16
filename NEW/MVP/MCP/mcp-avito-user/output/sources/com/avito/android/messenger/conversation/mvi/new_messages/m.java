package com.avito.android.messenger.conversation.mvi.new_messages;

import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.badge.Badge;
import com.avito.android.lib.design.button.Button;
import com.avito.android.messenger.conversation.mvi.new_messages.k;
import com.avito.android.util.C35971x;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;

/* compiled from: NewMessagesView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/new_messages/m;", "Lcom/avito/android/messenger/conversation/mvi/new_messages/k;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class m implements k {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f193819f = {m0.f406844a.f(new a0("lastRenderedState", "getLastRenderedState(Lcom/avito/android/mvi/Renderer;)Lcom/avito/android/messenger/conversation/mvi/new_messages/NewMessagesView$State;", m.class))};

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f193820b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Badge f193821c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.b f193822d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final C35971x f193823e;

    public m(@Y61.k View view) {
        View viewFindViewById = view.findViewById(R.id.update_proposal);
        this.f193820b = viewFindViewById;
        this.f193821c = (Badge) viewFindViewById.findViewById(R.id.messenger_updates_proposal_badge);
        Button button = (Button) viewFindViewById.findViewById(R.id.messenger_updates_proposal_button);
        this.f193822d = new com.jakewharton.rxrelay3.b();
        this.f193823e = new C35971x();
        final int i12 = 0;
        viewFindViewById.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.messenger.conversation.mvi.new_messages.l

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ m f193818c;

            {
                this.f193818c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i12) {
                    case 0:
                        this.f193818c.f193822d.accept(G0.f406611a);
                        break;
                    default:
                        this.f193818c.f193822d.accept(G0.f406611a);
                        break;
                }
            }
        });
        if (button != null) {
            final int i13 = 1;
            button.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.messenger.conversation.mvi.new_messages.l

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ m f193818c;

                {
                    this.f193818c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i13) {
                        case 0:
                            this.f193818c.f193822d.accept(G0.f406611a);
                            break;
                        default:
                            this.f193818c.f193822d.accept(G0.f406611a);
                            break;
                    }
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.mvi.e
    public final k.b a(com.avito.android.mvi.e<k.b> eVar) {
        kotlin.reflect.n<Object> nVar = f193819f[0];
        return (k.b) this.f193823e.f319122b;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [T, com.avito.android.messenger.conversation.mvi.new_messages.k$b] */
    @Override // com.avito.android.mvi.e
    public final void b(Object obj) {
        kotlin.reflect.n<Object> nVar = f193819f[0];
        this.f193823e.f319122b = (k.b) obj;
    }

    @Override // com.avito.android.mvi.e
    public final void d(com.avito.android.mvi.e<k.b> eVar, k.b bVar, k.b bVar2) {
        int i12;
        k.b bVar3 = bVar2;
        boolean z12 = bVar3 instanceof k.b.C5730b;
        View view = this.f193820b;
        if (z12) {
            k.b.C5730b c5730b = (k.b.C5730b) bVar3;
            if (!L.f(c5730b.f193811b, Boolean.FALSE) || (i12 = c5730b.f193814e) <= 0) {
                D6.o(view, 150L);
            } else {
                Badge badge = this.f193821c;
                if (badge != null) {
                    badge.setTitleText(i12 > 9 ? "9+" : String.valueOf(i12));
                }
                D6.n(view, 150L);
            }
        } else {
            if (!(bVar3 instanceof k.b.a)) {
                throw new NoWhenBranchMatchedException();
            }
            D6.o(view, 150L);
        }
        G0 g02 = G0.f406611a;
    }
}
