package com.avito.android.html_formatter.span;

import K51.d;
import Y61.k;
import Y61.l;
import android.graphics.Paint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Spanned;
import android.text.style.LineHeightSpan;
import android.text.style.UpdateLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: BlockElementSpan.kt */
@d
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/html_formatter/span/BlockElementSpan;", "Landroid/text/style/LineHeightSpan;", "Lcom/avito/android/html_formatter/span/HtmlSpan;", "Landroid/text/style/UpdateLayout;", "a", "c", "Type", "_common_html-formatter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class BlockElementSpan implements LineHeightSpan, HtmlSpan, UpdateLayout {

    @k
    public static final Parcelable.Creator<BlockElementSpan> CREATOR;

    /* renamed from: b, reason: collision with root package name */
    public final int f164241b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Type f164242c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public c f164243d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BlockElementSpan.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/html_formatter/span/BlockElementSpan$Type;", "", "_common_html-formatter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Type {

        /* renamed from: b, reason: collision with root package name */
        public static final Type f164244b;

        /* renamed from: c, reason: collision with root package name */
        public static final Type f164245c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ Type[] f164246d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f164247e;

        static {
            Type type = new Type("PARAGRAPH", 0);
            f164244b = type;
            Type type2 = new Type("LIST", 1);
            f164245c = type2;
            Type[] typeArr = {type, type2};
            f164246d = typeArr;
            f164247e = kotlin.enums.c.a(typeArr);
        }

        public Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f164246d.clone();
        }
    }

    /* compiled from: BlockElementSpan.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/html_formatter/span/BlockElementSpan$a;", "", "<init>", "()V", "", "PARAGRAPH_ELEMENT_SPAN_TYPE", "I", "_common_html-formatter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: BlockElementSpan.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<BlockElementSpan> {
        @Override // android.os.Parcelable.Creator
        public final BlockElementSpan createFromParcel(Parcel parcel) {
            return new BlockElementSpan(parcel.readInt(), Type.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final BlockElementSpan[] newArray(int i12) {
            return new BlockElementSpan[i12];
        }
    }

    /* compiled from: BlockElementSpan.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/html_formatter/span/BlockElementSpan$c;", "", "_common_html-formatter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f164248a;

        /* renamed from: b, reason: collision with root package name */
        public final int f164249b;

        public c(@k Paint.FontMetricsInt fontMetricsInt) {
            this.f164248a = fontMetricsInt.ascent;
            this.f164249b = fontMetricsInt.top;
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    public BlockElementSpan(int i12, @k Type type) {
        this.f164241b = i12;
        this.f164242c = type;
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(@k CharSequence charSequence, int i12, int i13, int i14, int i15, @k Paint.FontMetricsInt fontMetricsInt) {
        if (i12 == ((Spanned) charSequence).getSpanStart(this)) {
            this.f164243d = new c(fontMetricsInt);
            int i16 = fontMetricsInt.ascent;
            int i17 = this.f164241b;
            fontMetricsInt.ascent = i16 - i17;
            fontMetricsInt.top -= i17;
            return;
        }
        c cVar = this.f164243d;
        if (cVar != null) {
            fontMetricsInt.ascent = cVar.f164248a;
        }
        if (cVar != null) {
            fontMetricsInt.top = cVar.f164249b;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.avito.android.html_formatter.span.HtmlSpan
    public final int getType() {
        return 200;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.f164241b);
        parcel.writeString(this.f164242c.name());
    }
}
