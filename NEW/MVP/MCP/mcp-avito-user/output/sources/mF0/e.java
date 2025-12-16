package MF0;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.R;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: TrxPromoGoodsConfigureState.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, d2 = {"LMF0/e;", "", "<init>", "()V", "a", "b", "c", "d", "LMF0/e$b;", "LMF0/e$c;", "LMF0/e$d;", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final a f10523a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final d f10524b = new d(R.drawable.ic_back_24, new uZ.e(null, null));

    /* compiled from: TrxPromoGoodsConfigureState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LMF0/e$a;", "", "<init>", "()V", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: TrxPromoGoodsConfigureState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMF0/e$b;", "LMF0/e;", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends e {

        /* renamed from: c, reason: collision with root package name */
        public final int f10525c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final uZ.e f10526d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final List<com.avito.conveyor_item.a> f10527e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final ButtonAction f10528f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public final ButtonAction f10529g;

        /* renamed from: h, reason: collision with root package name */
        @l
        public final AttributedText f10530h;

        /* JADX WARN: Multi-variable type inference failed */
        public b(int i12, @k uZ.e eVar, @k List<? extends com.avito.conveyor_item.a> list, @l ButtonAction buttonAction, @l ButtonAction buttonAction2, @l AttributedText attributedText) {
            super(null);
            this.f10525c = i12;
            this.f10526d = eVar;
            this.f10527e = list;
            this.f10528f = buttonAction;
            this.f10529g = buttonAction2;
            this.f10530h = attributedText;
        }

        @Override // MF0.e
        @k
        /* renamed from: a, reason: from getter */
        public final uZ.e getF10535d() {
            return this.f10526d;
        }

        @Override // MF0.e
        /* renamed from: b, reason: from getter */
        public final int getF10534c() {
            return this.f10525c;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f10525c == bVar.f10525c && L.f(this.f10526d, bVar.f10526d) && L.f(this.f10527e, bVar.f10527e) && L.f(this.f10528f, bVar.f10528f) && L.f(this.f10529g, bVar.f10529g) && L.f(this.f10530h, bVar.f10530h);
        }

        public final int hashCode() {
            int iE2 = H.e((this.f10526d.hashCode() + (Integer.hashCode(this.f10525c) * 31)) * 31, 31, this.f10527e);
            ButtonAction buttonAction = this.f10528f;
            int iHashCode = (iE2 + (buttonAction == null ? 0 : buttonAction.hashCode())) * 31;
            ButtonAction buttonAction2 = this.f10529g;
            int iHashCode2 = (iHashCode + (buttonAction2 == null ? 0 : buttonAction2.hashCode())) * 31;
            AttributedText attributedText = this.f10530h;
            return iHashCode2 + (attributedText != null ? attributedText.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Content(navigationIcon=");
            sb2.append(this.f10525c);
            sb2.append(", navBar=");
            sb2.append(this.f10526d);
            sb2.append(", items=");
            sb2.append(this.f10527e);
            sb2.append(", primaryButtonAction=");
            sb2.append(this.f10528f);
            sb2.append(", secondaryButtonAction=");
            sb2.append(this.f10529g);
            sb2.append(", agreement=");
            return com.avito.android.actions_sheet.a.w(sb2, this.f10530h, ')');
        }
    }

    /* compiled from: TrxPromoGoodsConfigureState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMF0/e$c;", "LMF0/e;", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c extends e {

        /* renamed from: c, reason: collision with root package name */
        public final int f10531c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final uZ.e f10532d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final String f10533e;

        public c(int i12, @k uZ.e eVar, @k String str) {
            super(null);
            this.f10531c = i12;
            this.f10532d = eVar;
            this.f10533e = str;
        }

        @Override // MF0.e
        @k
        /* renamed from: a, reason: from getter */
        public final uZ.e getF10535d() {
            return this.f10532d;
        }

        @Override // MF0.e
        /* renamed from: b, reason: from getter */
        public final int getF10534c() {
            return this.f10531c;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f10531c == cVar.f10531c && L.f(this.f10532d, cVar.f10532d) && L.f(this.f10533e, cVar.f10533e);
        }

        public final int hashCode() {
            return this.f10533e.hashCode() + ((this.f10532d.hashCode() + (Integer.hashCode(this.f10531c) * 31)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Error(navigationIcon=");
            sb2.append(this.f10531c);
            sb2.append(", navBar=");
            sb2.append(this.f10532d);
            sb2.append(", message=");
            return C22026a.c(sb2, this.f10533e, ')');
        }
    }

    /* compiled from: TrxPromoGoodsConfigureState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMF0/e$d;", "LMF0/e;", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d extends e {

        /* renamed from: c, reason: collision with root package name */
        public final int f10534c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final uZ.e f10535d;

        public d(int i12, @k uZ.e eVar) {
            super(null);
            this.f10534c = i12;
            this.f10535d = eVar;
        }

        @Override // MF0.e
        @k
        /* renamed from: a, reason: from getter */
        public final uZ.e getF10535d() {
            return this.f10535d;
        }

        @Override // MF0.e
        /* renamed from: b, reason: from getter */
        public final int getF10534c() {
            return this.f10534c;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f10534c == dVar.f10534c && L.f(this.f10535d, dVar.f10535d);
        }

        public final int hashCode() {
            return this.f10535d.hashCode() + (Integer.hashCode(this.f10534c) * 31);
        }

        @k
        public final String toString() {
            return "Loading(navigationIcon=" + this.f10534c + ", navBar=" + this.f10535d + ')';
        }
    }

    public /* synthetic */ e(C42822w c42822w) {
        this();
    }

    @k
    /* renamed from: a */
    public abstract uZ.e getF10535d();

    /* renamed from: b */
    public abstract int getF10534c();

    public e() {
    }
}
