package com.avito.android.comfortable_deal.comment;

import Y41.l;
import Y61.k;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.input.n;
import com.avito.android.util.D6;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import mp.InterfaceC44113a;
import mp.InterfaceC44117e;

/* compiled from: CommentDialogView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/comment/d;", "Lcom/avito/android/comfortable_deal/comment/b;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class d implements b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l<InterfaceC44113a, G0> f120511a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public View f120512b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public View f120513c;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public d(@k l<? super InterfaceC44113a, G0> lVar) {
        this.f120511a = lVar;
    }

    @Override // com.avito.android.comfortable_deal.comment.b
    public final void a(@k View view) {
        this.f120512b = view;
        View viewFindViewById = view.findViewById(R.id.comment_label);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        ((TextView) viewFindViewById).setText(view.getContext().getString(R.string.comment_dialog_label));
        View viewFindViewById2 = view.findViewById(R.id.comment_field);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        Input input = (Input) viewFindViewById2;
        Input.p(input, 0, 0, 3);
        n.c(input, new c(this));
    }

    @Override // com.avito.android.comfortable_deal.comment.b
    public final void b(@k View view) {
        this.f120513c = view;
        View viewFindViewById = view.findViewById(R.id.save_button);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        ((Button) viewFindViewById).setOnClickListener(new com.avito.android.autoteka.presentation.reportGeneration.a(this, 27));
    }

    @Override // com.avito.android.comfortable_deal.comment.b
    public final void c(@k InterfaceC44117e interfaceC44117e) {
        FrameLayout frameLayout;
        Button button = null;
        if (interfaceC44117e instanceof InterfaceC44117e.b) {
            View view = this.f120512b;
            if (view != null) {
                View viewFindViewById = view.findViewById(R.id.loading_container);
                if (viewFindViewById == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
                }
                D6.H((FrameLayout) viewFindViewById);
            }
            View view2 = this.f120513c;
            if (view2 != null) {
                View viewFindViewById2 = view2.findViewById(R.id.save_button);
                if (viewFindViewById2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
                }
                button = (Button) viewFindViewById2;
            }
            if (button == null) {
                return;
            }
            button.setEnabled(false);
            return;
        }
        if (interfaceC44117e instanceof InterfaceC44117e.a) {
            View view3 = this.f120512b;
            if (view3 != null) {
                View viewFindViewById3 = view3.findViewById(R.id.loading_container);
                if (viewFindViewById3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
                }
                frameLayout = (FrameLayout) viewFindViewById3;
            } else {
                frameLayout = null;
            }
            D6.w(frameLayout);
            View view4 = this.f120512b;
            if (view4 != null) {
                View viewFindViewById4 = view4.findViewById(R.id.comment_field);
                if (viewFindViewById4 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
                }
                Input.t((Input) viewFindViewById4, ((InterfaceC44117e.a) interfaceC44117e).f414762a, false, 6);
            }
            View view5 = this.f120513c;
            if (view5 != null) {
                View viewFindViewById5 = view5.findViewById(R.id.save_button);
                if (viewFindViewById5 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
                }
                button = (Button) viewFindViewById5;
            }
            if (button == null) {
                return;
            }
            button.setEnabled(((InterfaceC44117e.a) interfaceC44117e).f414763b);
        }
    }
}
