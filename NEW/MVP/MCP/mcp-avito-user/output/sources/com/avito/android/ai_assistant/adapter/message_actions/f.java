package com.avito.android.ai_assistant.adapter.message_actions;

import Tb.f;
import Y61.k;
import Y61.l;
import a90.ViewOnLayoutChangeListenerC19701a;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.res.i;
import com.avito.android.R;
import com.avito.android.ai_assistant.model.ReactionState;
import com.avito.android.util.y6;
import com.google.android.flexbox.FlexboxLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: MessageActionsItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/ai_assistant/adapter/message_actions/f;", "Lcom/avito/android/ai_assistant/adapter/message_actions/e;", "Lcom/avito/konveyor/adapter/b;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f extends com.avito.konveyor.adapter.b implements e {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f88821s = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final h f88822b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final FlexboxLayout f88823c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final View f88824d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final ImageView f88825e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final View f88826f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final ImageView f88827g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final View f88828h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final ViewGroup f88829i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final TextView f88830j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final ViewGroup f88831k;

    /* renamed from: l, reason: collision with root package name */
    public final int f88832l;

    /* renamed from: m, reason: collision with root package name */
    public final int f88833m;

    /* renamed from: n, reason: collision with root package name */
    @l
    public final Drawable f88834n;

    /* renamed from: o, reason: collision with root package name */
    @l
    public final Drawable f88835o;

    /* renamed from: p, reason: collision with root package name */
    @l
    public final Drawable f88836p;

    /* renamed from: q, reason: collision with root package name */
    @l
    public final Drawable f88837q;

    /* renamed from: r, reason: collision with root package name */
    @l
    public g f88838r;

    /* compiled from: MessageActionsItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[ReactionState.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ReactionState reactionState = ReactionState.f89129b;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ReactionState reactionState2 = ReactionState.f89129b;
                iArr[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public f(@k View view, @k h hVar) {
        super(view);
        this.f88822b = hVar;
        FlexboxLayout flexboxLayout = (FlexboxLayout) view;
        this.f88823c = flexboxLayout;
        this.f88824d = view.findViewById(R.id.like_container);
        this.f88825e = (ImageView) view.findViewById(R.id.like);
        this.f88826f = view.findViewById(R.id.dislike_container);
        this.f88827g = (ImageView) view.findViewById(R.id.dislike);
        this.f88828h = view.findViewById(R.id.feedback_container);
        this.f88829i = (ViewGroup) view.findViewById(R.id.reactions_container);
        this.f88830j = (TextView) view.findViewById(R.id.motivation_text);
        this.f88831k = (ViewGroup) view.findViewById(R.id.motivation_container);
        this.f88832l = y6.b(20);
        this.f88833m = y6.b(22);
        Resources resources = view.getResources();
        Resources.Theme theme = view.getContext().getTheme();
        ThreadLocal<TypedValue> threadLocal = i.f44673a;
        this.f88834n = resources.getDrawable(R.drawable.ai_assistant_like_unchecked, theme);
        this.f88835o = view.getResources().getDrawable(R.drawable.ai_assistant_like_checked, view.getContext().getTheme());
        this.f88836p = view.getResources().getDrawable(R.drawable.ai_assistant_dislike_unchecked, view.getContext().getTheme());
        this.f88837q = view.getResources().getDrawable(R.drawable.ai_assistant_dislike_checked, view.getContext().getTheme());
        flexboxLayout.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC19701a(this, 1));
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f88823c.removeCallbacks(this.f88838r);
    }

    @Override // com.avito.konveyor.util.d
    public final void kD(TV0.a aVar) {
        com.avito.android.ai_assistant.adapter.message_actions.a aVar2 = (com.avito.android.ai_assistant.adapter.message_actions.a) aVar;
        f.b bVar = null;
        f.c.b bVar2 = null;
        f.c.a aVar3 = null;
        f.a aVar4 = null;
        for (Tb.f fVar : aVar2.f88814d) {
            if (fVar instanceof f.b) {
                if (bVar == null) {
                    bVar = (f.b) fVar;
                }
            } else if (fVar instanceof f.c.b) {
                if (bVar2 == null) {
                    bVar2 = (f.c.b) fVar;
                }
            } else if (fVar instanceof f.c.a) {
                if (aVar3 == null) {
                    aVar3 = (f.c.a) fVar;
                }
            } else if ((fVar instanceof f.a) && aVar4 == null) {
                aVar4 = (f.a) fVar;
            }
            if (bVar != null && bVar2 != null && aVar3 != null && aVar4 != null) {
                break;
            }
        }
        f.c.a aVar5 = aVar3;
        f.a aVar6 = aVar4;
        f.c.b bVar3 = bVar2;
        String str = bVar != null ? bVar.f15744a : null;
        this.f88831k.setVisibility((str == null || str.length() == 0) ? 8 : 0);
        this.f88830j.setText(bVar != null ? bVar.f15744a : null);
        this.f88829i.setVisibility((bVar3 == null && aVar5 == null) ? 8 : 0);
        int i12 = bVar3 != null ? 0 : 8;
        View view = this.f88824d;
        view.setVisibility(i12);
        int i13 = aVar5 != null ? 0 : 8;
        View view2 = this.f88826f;
        view2.setVisibility(i13);
        int i14 = aVar6 != null ? 0 : 8;
        View view3 = this.f88828h;
        view3.setVisibility(i14);
        ReactionState reactionState = aVar2.f88815e;
        int iOrdinal = reactionState.ordinal();
        Drawable drawable = this.f88836p;
        Drawable drawable2 = this.f88834n;
        ImageView imageView = this.f88827g;
        ImageView imageView2 = this.f88825e;
        if (iOrdinal == 0) {
            imageView2.setImageDrawable(drawable2);
            imageView.setImageDrawable(drawable);
        } else if (iOrdinal == 1) {
            imageView2.setImageDrawable(this.f88835o);
            imageView.setImageDrawable(drawable);
        } else if (iOrdinal == 2) {
            imageView2.setImageDrawable(drawable2);
            imageView.setImageDrawable(this.f88837q);
        }
        String str2 = aVar2.f88813c;
        if (bVar3 != null) {
            view.setOnClickListener(new com.avito.android.advert_core.advert.f(2, str2, this, reactionState, bVar3));
        } else {
            view.setOnClickListener(null);
        }
        if (aVar5 != null) {
            view2.setOnClickListener(new com.avito.android.advert_core.advert.f(3, str2, this, reactionState, aVar5));
        } else {
            view2.setOnClickListener(null);
        }
        if (aVar6 != null) {
            view3.setOnClickListener(new com.avito.android.advertising.adapter.items.buzzoola.media_x2.d(3, this, aVar6));
        } else {
            view3.setOnClickListener(null);
        }
    }
}
