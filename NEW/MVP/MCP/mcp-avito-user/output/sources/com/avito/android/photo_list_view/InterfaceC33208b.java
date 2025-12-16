package com.avito.android.photo_list_view;

import android.net.Uri;
import androidx.compose.runtime.C22026a;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.UniversalColor;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ImageData.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_list_view/b;", "", "a", "b", "_avito_photo-list-view_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.photo_list_view.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public interface InterfaceC33208b {

    /* compiled from: ImageData.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/photo_list_view/b$b;", "", "a", "b", "c", "d", "_avito_photo-list-view_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.photo_list_view.b$b, reason: collision with other inner class name */
    public interface InterfaceC6540b {

        /* compiled from: ImageData.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_list_view/b$b$a;", "Lcom/avito/android/photo_list_view/b$b;", "<init>", "()V", "_avito_photo-list-view_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.photo_list_view.b$b$a */
        public static final class a implements InterfaceC6540b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final a f218117a = new a();
        }

        /* compiled from: ImageData.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_list_view/b$b$b;", "Lcom/avito/android/photo_list_view/b$b;", "_avito_photo-list-view_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.photo_list_view.b$b$b, reason: collision with other inner class name */
        public static final /* data */ class C6541b implements InterfaceC6540b {

            /* renamed from: a, reason: collision with root package name */
            public final boolean f218118a;

            public C6541b(boolean z12) {
                this.f218118a = z12;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C6541b) && this.f218118a == ((C6541b) obj).f218118a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f218118a);
            }

            @Y61.k
            public final String toString() {
                return androidx.appcompat.app.r.x(new StringBuilder("Error(isRestorable="), this.f218118a, ')');
            }
        }

        /* compiled from: ImageData.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_list_view/b$b$c;", "Lcom/avito/android/photo_list_view/b$b;", "<init>", "()V", "_avito_photo-list-view_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.photo_list_view.b$b$c */
        public static final class c implements InterfaceC6540b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final c f218119a = new c();
        }

        /* compiled from: ImageData.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_list_view/b$b$d;", "Lcom/avito/android/photo_list_view/b$b;", "<init>", "()V", "_avito_photo-list-view_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.photo_list_view.b$b$d */
        public static final class d implements InterfaceC6540b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final d f218120a = new d();
        }
    }

    @Y61.k
    List<a> a();

    @Y61.l
    /* renamed from: b */
    Uri getF218069b();

    @Y61.k
    /* renamed from: getId */
    String getF218068a();

    @Y61.k
    /* renamed from: getState */
    InterfaceC6540b getF218070c();

    /* compiled from: ImageData.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/photo_list_view/b$a;", "", "a", "_avito_photo-list-view_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.photo_list_view.b$a */
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final PrintableText f218110a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final Integer f218111b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final UniversalColor f218112c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final String f218113d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final C6539a f218114e;

        /* compiled from: ImageData.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_list_view/b$a$a;", "", "_avito_photo-list-view_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.photo_list_view.b$a$a, reason: collision with other inner class name */
        public static final /* data */ class C6539a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final String f218115a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final String f218116b;

            public C6539a(@Y61.k String str, @Y61.k String str2) {
                this.f218115a = str;
                this.f218116b = str2;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C6539a)) {
                    return false;
                }
                C6539a c6539a = (C6539a) obj;
                return kotlin.jvm.internal.L.f(this.f218115a, c6539a.f218115a) && kotlin.jvm.internal.L.f(this.f218116b, c6539a.f218116b);
            }

            public final int hashCode() {
                return this.f218116b.hashCode() + (this.f218115a.hashCode() * 31);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Tooltip(title=");
                sb2.append(this.f218115a);
                sb2.append(", description=");
                return C22026a.c(sb2, this.f218116b, ')');
            }
        }

        public a(@Y61.l PrintableText printableText, @Y61.l Integer num, @Y61.l UniversalColor universalColor, @Y61.l String str, @Y61.l C6539a c6539a) {
            this.f218110a = printableText;
            this.f218111b = num;
            this.f218112c = universalColor;
            this.f218113d = str;
            this.f218114e = c6539a;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.L.f(this.f218110a, aVar.f218110a) && kotlin.jvm.internal.L.f(this.f218111b, aVar.f218111b) && kotlin.jvm.internal.L.f(this.f218112c, aVar.f218112c) && kotlin.jvm.internal.L.f(this.f218113d, aVar.f218113d) && kotlin.jvm.internal.L.f(this.f218114e, aVar.f218114e);
        }

        public final int hashCode() {
            PrintableText printableText = this.f218110a;
            int iHashCode = (printableText == null ? 0 : printableText.hashCode()) * 31;
            Integer num = this.f218111b;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            UniversalColor universalColor = this.f218112c;
            int iHashCode3 = (iHashCode2 + (universalColor == null ? 0 : universalColor.hashCode())) * 31;
            String str = this.f218113d;
            int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            C6539a c6539a = this.f218114e;
            return iHashCode4 + (c6539a != null ? c6539a.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            return "Label(text=" + this.f218110a + ", imageResId=" + this.f218111b + ", color=" + this.f218112c + ", id=" + this.f218113d + ", tooltip=" + this.f218114e + ')';
        }

        public /* synthetic */ a(PrintableText printableText, Integer num, UniversalColor universalColor, String str, C6539a c6539a, int i12, C42822w c42822w) {
            this(printableText, num, (i12 & 4) != 0 ? null : universalColor, (i12 & 8) != 0 ? null : str, (i12 & 16) != 0 ? null : c6539a);
        }
    }
}
