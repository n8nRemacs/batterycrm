package com.avito.android.html_formatter.span;

import Y61.k;
import Y61.l;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: ListElementSpan.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/html_formatter/span/ListElementSpan;", "Landroid/text/style/LeadingMarginSpan;", "Lcom/avito/android/html_formatter/span/HtmlSpan;", "CREATOR", "a", "_common_html-formatter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42830m
/* loaded from: classes13.dex */
public final class ListElementSpan implements LeadingMarginSpan, HtmlSpan {

    /* renamed from: CREATOR, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: b, reason: collision with root package name */
    public final int f164250b;

    /* renamed from: c, reason: collision with root package name */
    public final int f164251c;

    /* renamed from: d, reason: collision with root package name */
    public final int f164252d;

    /* renamed from: e, reason: collision with root package name */
    public final int f164253e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final List<String> f164254f;

    /* compiled from: ListElementSpan.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/html_formatter/span/ListElementSpan$a;", "Landroid/os/Parcelable$Creator;", "Lcom/avito/android/html_formatter/span/ListElementSpan;", "<init>", "()V", "", "LIST_ELEMENT_SPAN_TYPE", "I", "_common_html-formatter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.html_formatter.span.ListElementSpan$a, reason: from kotlin metadata */
    public static final class Companion implements Parcelable.Creator<ListElementSpan> {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        public final ListElementSpan createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            int i13 = parcel.readInt();
            int i14 = parcel.readInt();
            int i15 = parcel.readInt();
            ArrayList arrayList = new ArrayList();
            parcel.readStringList(arrayList);
            return new ListElementSpan(i12, i13, i14, i15, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final ListElementSpan[] newArray(int i12) {
            return new ListElementSpan[i12];
        }

        public Companion() {
        }
    }

    public ListElementSpan(int i12, int i13, int i14, int i15, @k List<String> list) {
        this.f164250b = i12;
        this.f164251c = i13;
        this.f164252d = i14;
        this.f164253e = i15;
        this.f164254f = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(@k Canvas canvas, @k Paint paint, int i12, int i13, int i14, int i15, int i16, @l CharSequence charSequence, int i17, int i18, boolean z12, @k Layout layout) {
        int i19;
        Spanned spanned = (Spanned) charSequence;
        int lineBaseline = layout.getLineBaseline(layout.getLineForOffset(spanned.getSpanStart(this)));
        List<String> list = this.f164254f;
        String str = list.isEmpty() ? "" : (String) C42745f0.Q(list);
        boolean z13 = spanned.getSpanStart(this) == i17;
        Iterator it = C42745f0.x(list).iterator();
        int length = 0;
        while (true) {
            boolean zHasNext = it.hasNext();
            i19 = this.f164250b;
            if (!zHasNext) {
                break;
            }
            String str2 = (String) it.next();
            length += ((str2.length() == 0 ? 0 : str2.length() + this.f164253e) * this.f164252d) + i19 + this.f164251c;
        }
        if (z13) {
            canvas.drawText(str, length + i19, lineBaseline, paint);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z12) {
        List<String> list = this.f164254f;
        String str = list.isEmpty() ? "" : (String) C42745f0.Q(list);
        return ((str.length() == 0 ? 0 : str.length() + this.f164253e) * this.f164252d) + this.f164250b + this.f164251c;
    }

    @Override // com.avito.android.html_formatter.span.HtmlSpan
    public final int getType() {
        return 100;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.f164250b);
        parcel.writeInt(this.f164251c);
        parcel.writeInt(this.f164252d);
        parcel.writeInt(this.f164253e);
        parcel.writeStringList(this.f164254f);
    }
}
