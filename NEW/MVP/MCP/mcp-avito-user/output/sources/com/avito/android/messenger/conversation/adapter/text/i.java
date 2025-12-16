package com.avito.android.messenger.conversation.adapter.text;

import Y41.l;
import Y61.k;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.messenger.conversation.adapter.m;
import com.avito.android.messenger.conversation.adapter.n;
import com.avito.android.messenger.conversation.adapter.text.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: TextMessageViewDelegate.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/messenger/conversation/adapter/text/i;", "Lcom/avito/android/messenger/conversation/adapter/text/d;", "Lcom/avito/android/messenger/conversation/adapter/m;", "Lcom/avito/android/messenger/conversation/adapter/quote/c;", "Lcom/avito/android/messenger/conversation/adapter/e;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class i implements d, m, com.avito.android.messenger.conversation.adapter.quote.c, com.avito.android.messenger.conversation.adapter.e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f189302b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f189303c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.messenger.conversation.adapter.f f189304d;

    /* renamed from: e, reason: collision with root package name */
    public final float f189305e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final LinearLayout f189306f;

    /* renamed from: g, reason: collision with root package name */
    public final LayoutInflater f189307g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final ArrayList f189308h;

    public i(@k View view) {
        this.f189302b = view;
        this.f189303c = new n(view);
        new com.avito.android.messenger.conversation.adapter.quote.d(view);
        this.f189304d = new com.avito.android.messenger.conversation.adapter.f();
        view.getContext();
        this.f189305e = view.getResources().getDimensionPixelSize(R.dimen.big_text_size) * 4.0f;
        this.f189306f = (LinearLayout) view.findViewById(R.id.message);
        this.f189307g = LayoutInflater.from(view.getContext());
        this.f189308h = new ArrayList();
    }

    @Override // com.avito.android.messenger.conversation.adapter.m
    public final void KC(@k Y41.a<Boolean> aVar) {
        throw null;
    }

    @Override // com.avito.android.messenger.conversation.adapter.text.d
    public final void W30(@k l lVar, @k List list) {
        ArrayList arrayList = this.f189308h;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.f189306f.removeView((View) it.next());
        }
        arrayList.clear();
        if (list.size() == 1) {
            e0((d.b) list.get(0));
            return;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            e0((d.b) it2.next());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.messenger.conversation.adapter.m
    public final void c(@k Y41.a<G0> aVar) {
        this.f189303c.f189258c = (N) aVar;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.C] */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.Object, kotlin.C] */
    public final void e0(d.b bVar) {
        TextView textView;
        boolean z12 = bVar instanceof d.b.C5581b;
        LayoutInflater layoutInflater = this.f189307g;
        ViewGroup viewGroup = this.f189306f;
        if (z12) {
            ((d.b.C5581b) bVar).getClass();
            throw null;
        }
        if (bVar instanceof d.b.c) {
            String str = ((d.b.c) bVar).f189299a;
            textView = (TextView) layoutInflater.inflate(R.layout.messenger_text_bubble_body_plain_text_view, viewGroup, false);
            b.f189290b.getClass();
            textView.setMovementMethod((b) b.f189291c.getValue());
            textView.setText(str);
            textView.setOnClickListener(g.f189300b);
            textView.setOnLongClickListener(h.f189301b);
        } else {
            if (!(bVar instanceof d.b.a)) {
                throw new NoWhenBranchMatchedException();
            }
            ((d.b.a) bVar).getClass();
            textView = (TextView) layoutInflater.inflate(R.layout.messenger_text_bubble_body_plain_text_view, viewGroup, false);
            textView.setTextSize(0, this.f189305e);
            b.f189290b.getClass();
            textView.setMovementMethod((b) b.f189291c.getValue());
            textView.setText((CharSequence) null);
            textView.setOnClickListener(g.f189300b);
            textView.setOnLongClickListener(h.f189301b);
        }
        textView.setId(View.generateViewId());
        viewGroup.addView(textView, -2, -2);
        this.f189308h.add(textView);
    }

    @Override // TV0.e
    public final void j5() {
        this.f189304d.getClass();
    }
}
