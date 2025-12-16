package com.avito.android.html_formatter;

import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import com.avito.android.html_formatter.span.BlockElementSpan;
import com.avito.android.html_formatter.span.HtmlSpan;
import com.avito.android.html_formatter.span.ListElementSpan;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlin.ranges.l;

/* compiled from: HtmlCharSequence.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/html_formatter/HtmlCharSequence;", "Landroid/text/Spannable;", "Landroid/os/Parcelable;", "CREATOR", "a", "_common_html-formatter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42830m
/* loaded from: classes13.dex */
public final class HtmlCharSequence implements Spannable, Parcelable {

    /* renamed from: CREATOR, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Object f164164b;

    /* compiled from: HtmlCharSequence.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/html_formatter/HtmlCharSequence$a;", "Landroid/os/Parcelable$Creator;", "Lcom/avito/android/html_formatter/HtmlCharSequence;", "<init>", "()V", "_common_html-formatter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.html_formatter.HtmlCharSequence$a, reason: from kotlin metadata */
    public static final class Companion implements Parcelable.Creator<HtmlCharSequence> {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        public final HtmlCharSequence createFromParcel(Parcel parcel) {
            SpannableString spannableString = new SpannableString((CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel));
            int i12 = parcel.readInt();
            if (i12 > 0) {
                kotlin.ranges.k it = new l(1, i12, 1).iterator();
                while (it.f406910d) {
                    it.a();
                    HtmlCharSequence.INSTANCE.getClass();
                    int i13 = parcel.readInt();
                    int i14 = parcel.readInt();
                    int i15 = parcel.readInt();
                    int i16 = parcel.readInt();
                    HtmlSpan htmlSpan = i16 != 100 ? i16 != 200 ? null : (HtmlSpan) parcel.readParcelable(BlockElementSpan.class.getClassLoader()) : (HtmlSpan) parcel.readParcelable(ListElementSpan.class.getClassLoader());
                    if (htmlSpan != null) {
                        spannableString.setSpan(htmlSpan, i13, i14, i15);
                    }
                }
            }
            return new HtmlCharSequence(spannableString);
        }

        @Override // android.os.Parcelable.Creator
        public final HtmlCharSequence[] newArray(int i12) {
            return new HtmlCharSequence[i12];
        }

        public Companion() {
        }
    }

    public HtmlCharSequence(@k Spannable spannable) {
        this.f164164b = spannable;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // java.lang.CharSequence
    public final char charAt(int i12) {
        return this.f164164b.charAt(i12);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.text.Spanned, java.lang.Object] */
    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f164164b.getSpanEnd(obj);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.text.Spanned, java.lang.Object] */
    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f164164b.getSpanFlags(obj);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.text.Spanned, java.lang.Object] */
    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f164164b.getSpanStart(obj);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.text.Spanned, java.lang.Object] */
    @Override // android.text.Spanned
    public final <T> T[] getSpans(int i12, int i13, Class<T> cls) {
        return (T[]) this.f164164b.getSpans(i12, i13, cls);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // java.lang.CharSequence
    public final int length() {
        return this.f164164b.length();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.text.Spanned, java.lang.Object] */
    @Override // android.text.Spanned
    public final int nextSpanTransition(int i12, int i13, Class cls) {
        return this.f164164b.nextSpanTransition(i12, i13, cls);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.text.Spannable, java.lang.Object] */
    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        this.f164164b.removeSpan(obj);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.text.Spannable, java.lang.Object] */
    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i12, int i13, int i14) {
        this.f164164b.setSpan(obj, i12, i13, i14);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // java.lang.CharSequence
    @k
    public final CharSequence subSequence(int i12, int i13) {
        return this.f164164b.subSequence(i12, i13);
    }

    @Override // java.lang.CharSequence
    @k
    public final String toString() {
        return this.f164164b.toString();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.text.Spanned, java.lang.CharSequence, java.lang.Object] */
    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        TextUtils.writeToParcel(this, parcel, i12);
        ?? r02 = this.f164164b;
        HtmlSpan[] htmlSpanArr = (HtmlSpan[]) r02.getSpans(0, r02.length(), HtmlSpan.class);
        parcel.writeInt(htmlSpanArr.length);
        for (HtmlSpan htmlSpan : htmlSpanArr) {
            parcel.writeInt(r02.getSpanStart(htmlSpan));
            parcel.writeInt(r02.getSpanEnd(htmlSpan));
            parcel.writeInt(r02.getSpanFlags(htmlSpan));
            parcel.writeInt(htmlSpan.getType());
            parcel.writeParcelable(htmlSpan, i12);
        }
    }
}
