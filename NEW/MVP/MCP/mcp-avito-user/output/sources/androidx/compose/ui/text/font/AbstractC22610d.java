package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.ui.text.font.d0;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AndroidFont.android.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u00002\u00020\u0001:\u0001\u000bB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\n¨\u0006\f"}, d2 = {"Landroidx/compose/ui/text/font/d;", "Landroidx/compose/ui/text/font/D;", "Landroidx/compose/ui/text/font/X;", "loadingStrategy", "Landroidx/compose/ui/text/font/d$a;", "typefaceLoader", "Landroidx/compose/ui/text/font/d0$e;", "variationSettings", "<init>", "(ILandroidx/compose/ui/text/font/d$a;Landroidx/compose/ui/text/font/d0$e;Lkotlin/jvm/internal/w;)V", "(ILandroidx/compose/ui/text/font/d$a;Lkotlin/jvm/internal/w;)V", "a", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.text.font.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC22610d implements D {

    /* renamed from: a, reason: collision with root package name */
    public final int f42230a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final a f42231b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final d0.e f42232c;

    /* compiled from: AndroidFont.android.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/text/font/d$a;", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.text.font.d$a */
    public interface a {
        @Y61.l
        Object a();

        @Y61.l
        Typeface b(@Y61.k Context context, @Y61.k AbstractC22610d abstractC22610d);
    }

    public AbstractC22610d(int i12, a aVar, d0.e eVar, C42822w c42822w) {
        this.f42230a = i12;
        this.f42231b = aVar;
        this.f42232c = eVar;
    }

    @Override // androidx.compose.ui.text.font.D
    /* renamed from: a, reason: from getter */
    public final int getF42230a() {
        return this.f42230a;
    }

    @InterfaceC42830m
    public AbstractC22610d(int i12, a aVar, C42822w c42822w) {
        this(i12, aVar, new d0.e(new d0.a[0]), null);
    }
}
