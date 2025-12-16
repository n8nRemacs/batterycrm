package com.avito.android.mortgage.landing.utils;

import Y61.k;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.lib.util.layout.OffsetLayout;
import com.avito.android.mortgage.api.model.landing.TitlePart;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: TitleContainerTextHelper.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/landing/utils/b;", "", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final OffsetLayout f200329a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f200330b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ArrayList f200331c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ArrayList f200332d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    @k
    public final ArrayList f200333e = new ArrayList();

    /* compiled from: TitleContainerTextHelper.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f200334a;

        static {
            int[] iArr = new int[TitlePart.TitlePartType.values().length];
            try {
                iArr[TitlePart.TitlePartType.GREEN_BADGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TitlePart.TitlePartType.PLAIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f200334a = iArr;
        }
    }

    public b(@k OffsetLayout offsetLayout, @k com.avito.android.util.text.a aVar) {
        this.f200329a = offsetLayout;
        this.f200330b = aVar;
    }

    public final void a(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        this.f200329a.addView(textView);
        this.f200332d.add(textView);
        this.f200331c.add(C42745f0.e0(textView));
    }

    public final TextView b() {
        TextView textView = (TextView) C42745f0.o0(this.f200333e);
        if (textView != null) {
            return textView;
        }
        com.avito.android.lib.design.text_view.a aVar = new com.avito.android.lib.design.text_view.a(this.f200329a.getContext(), null, 0, 0, 14, null);
        aVar.setIncludeFontPadding(false);
        return aVar;
    }
}
