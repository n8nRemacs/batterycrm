package com.avito.android.beduin_shared.model.progress_overlay;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.akita.compose.component.accordion.s;
import com.avito.android.R;
import com.avito.android.util.C35835l0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ContentPlaceholderState.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/beduin_shared/model/progress_overlay/b;", "", "a", "b", "Lcom/avito/android/beduin_shared/model/progress_overlay/b$a;", "Lcom/avito/android/beduin_shared/model/progress_overlay/b$b;", "_avito_beduin-shared_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface b {

    /* compiled from: ContentPlaceholderState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin_shared/model/progress_overlay/b$b;", "Lcom/avito/android/beduin_shared/model/progress_overlay/b;", "<init>", "()V", "_avito_beduin-shared_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin_shared.model.progress_overlay.b$b, reason: collision with other inner class name */
    public static final class C3148b implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C3148b f105322a = new C3148b();
    }

    /* compiled from: ContentPlaceholderState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin_shared/model/progress_overlay/b$a;", "Lcom/avito/android/beduin_shared/model/progress_overlay/b;", "a", "_avito_beduin-shared_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final CharSequence f105315a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final CharSequence f105316b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Drawable f105317c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final C3147a f105318d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final Integer f105319e;

        /* compiled from: ContentPlaceholderState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin_shared/model/progress_overlay/b$a$a;", "", "_avito_beduin-shared_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.beduin_shared.model.progress_overlay.b$a$a, reason: collision with other inner class name */
        public static final /* data */ class C3147a {

            /* renamed from: a, reason: collision with root package name */
            @l
            public final CharSequence f105320a;

            /* renamed from: b, reason: collision with root package name */
            @l
            public final View.OnClickListener f105321b;

            public C3147a(@l CharSequence charSequence, @l View.OnClickListener onClickListener) {
                this.f105320a = charSequence;
                this.f105321b = onClickListener;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3147a)) {
                    return false;
                }
                C3147a c3147a = (C3147a) obj;
                return L.f(this.f105320a, c3147a.f105320a) && L.f(this.f105321b, c3147a.f105321b);
            }

            public final int hashCode() {
                CharSequence charSequence = this.f105320a;
                int iHashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
                View.OnClickListener onClickListener = this.f105321b;
                return iHashCode + (onClickListener != null ? onClickListener.hashCode() : 0);
            }

            @k
            public final String toString() {
                return "Button(title=" + ((Object) this.f105320a) + ", onClickListener=" + this.f105321b + ')';
            }
        }

        public a(@l CharSequence charSequence, @l CharSequence charSequence2, @l Drawable drawable, @l C3147a c3147a, @l Integer num) {
            this.f105315a = charSequence;
            this.f105316b = charSequence2;
            this.f105317c = drawable;
            this.f105318d = c3147a;
            this.f105319e = num;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f105315a, aVar.f105315a) && L.f(this.f105316b, aVar.f105316b) && L.f(this.f105317c, aVar.f105317c) && L.f(this.f105318d, aVar.f105318d) && L.f(this.f105319e, aVar.f105319e);
        }

        public final int hashCode() {
            CharSequence charSequence = this.f105315a;
            int iHashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
            CharSequence charSequence2 = this.f105316b;
            int iHashCode2 = (iHashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
            Drawable drawable = this.f105317c;
            int iHashCode3 = (iHashCode2 + (drawable == null ? 0 : drawable.hashCode())) * 31;
            C3147a c3147a = this.f105318d;
            int iHashCode4 = (iHashCode3 + (c3147a == null ? 0 : c3147a.hashCode())) * 31;
            Integer num = this.f105319e;
            return iHashCode4 + (num != null ? num.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Data(title=");
            sb2.append((Object) this.f105315a);
            sb2.append(", subtitle=");
            sb2.append((Object) this.f105316b);
            sb2.append(", image=");
            sb2.append(this.f105317c);
            sb2.append(", button=");
            sb2.append(this.f105318d);
            sb2.append(", themeRes=");
            return s.j(sb2, this.f105319e, ')');
        }

        public a(Context context, CharSequence charSequence, CharSequence charSequence2, Drawable drawable, CharSequence charSequence3, View.OnClickListener onClickListener, int i12, C42822w c42822w) {
            this((i12 & 2) != 0 ? context.getString(R.string.content_placeholder_something_went_wrong) : charSequence, (i12 & 4) != 0 ? context.getString(R.string.content_placeholder_try_refreshing_page) : charSequence2, (i12 & 8) != 0 ? C35835l0.h(R.attr.img_unknownError, context) : drawable, new C3147a((i12 & 16) != 0 ? context.getString(R.string.content_placeholder_refresh) : charSequence3, onClickListener), null);
        }
    }
}
