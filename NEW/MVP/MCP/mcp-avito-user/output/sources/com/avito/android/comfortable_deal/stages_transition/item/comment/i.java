package com.avito.android.comfortable_deal.stages_transition.item.comment;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.input.n;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CommentView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/comfortable_deal/stages_transition/item/comment/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/comfortable_deal/stages_transition/item/comment/g;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class i extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f122867e = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f122868b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Input f122869c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public Y41.l<? super String, G0> f122870d;

    /* compiled from: CommentView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "text", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<String, G0> {
        public a() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(String str) {
            String str2 = str;
            Y41.l<? super String, G0> lVar = i.this.f122870d;
            if (lVar != null) {
                lVar.invoke(str2);
            }
            return G0.f406611a;
        }
    }

    public i(@k View view) {
        super(view);
        this.f122868b = (TextView) view.findViewById(R.id.comment_label);
        Input input = (Input) view.findViewById(R.id.comment_field);
        this.f122869c = input;
        input.setOnFocusChangeListener(new h(input, 0));
        n.c(input, new a());
    }

    @Override // com.avito.android.comfortable_deal.stages_transition.item.comment.g
    public final void LU() {
        D6.G(this.f122868b, true);
    }

    @Override // com.avito.android.comfortable_deal.stages_transition.item.comment.g
    public final void c5(@l String str) {
        Input.t(this.f122869c, str, false, 6);
    }

    @Override // com.avito.android.comfortable_deal.stages_transition.item.comment.g
    public final void r0(@k Y41.l<? super String, G0> lVar) {
        this.f122870d = lVar;
    }
}
