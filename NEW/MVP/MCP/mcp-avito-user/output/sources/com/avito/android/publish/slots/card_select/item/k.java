package com.avito.android.publish.slots.card_select.item;

import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.CategoryPublishStep;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CardSelectSlotItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/publish/slots/card_select/item/k;", "", "<init>", "()V", "a", "b", "c", "d", "Lcom/avito/android/publish/slots/card_select/item/k$a;", "Lcom/avito/android/publish/slots/card_select/item/k$b;", "Lcom/avito/android/publish/slots/card_select/item/k$c;", "Lcom/avito/android/publish/slots/card_select/item/k$d;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public abstract class k {

    /* compiled from: CardSelectSlotItemPresenter.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/card_select/item/k$a;", "Lcom/avito/android/publish/slots/card_select/item/k;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends k {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final AttributedText f243158a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final DeepLink f243159b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final CategoryPublishStep.Params.NavigationButtonAction f243160c;

        public a(@l AttributedText attributedText, @l DeepLink deepLink, @l CategoryPublishStep.Params.NavigationButtonAction navigationButtonAction) {
            super(null);
            this.f243158a = attributedText;
            this.f243159b = deepLink;
            this.f243160c = navigationButtonAction;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f243158a, aVar.f243158a) && L.f(this.f243159b, aVar.f243159b) && this.f243160c == aVar.f243160c;
        }

        public final int hashCode() {
            AttributedText attributedText = this.f243158a;
            int iHashCode = (attributedText == null ? 0 : attributedText.hashCode()) * 31;
            DeepLink deepLink = this.f243159b;
            int iHashCode2 = (iHashCode + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
            CategoryPublishStep.Params.NavigationButtonAction navigationButtonAction = this.f243160c;
            return iHashCode2 + (navigationButtonAction != null ? navigationButtonAction.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            return "AuctionSelected(disclaimer=" + this.f243158a + ", deepLink=" + this.f243159b + ", navigationAction=" + this.f243160c + ')';
        }
    }

    /* compiled from: CardSelectSlotItemPresenter.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/slots/card_select/item/k$b;", "Lcom/avito/android/publish/slots/card_select/item/k;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends k {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final b f243161a = new b();

        public b() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 178725418;
        }

        @Y61.k
        public final String toString() {
            return "ConditionalContinueEnabled";
        }
    }

    /* compiled from: CardSelectSlotItemPresenter.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/card_select/item/k$c;", "Lcom/avito/android/publish/slots/card_select/item/k;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c extends k {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final CategoryPublishStep.Params.NavigationButtonAction f243162a;

        public c(@l CategoryPublishStep.Params.NavigationButtonAction navigationButtonAction) {
            super(null);
            this.f243162a = navigationButtonAction;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f243162a == ((c) obj).f243162a;
        }

        public final int hashCode() {
            CategoryPublishStep.Params.NavigationButtonAction navigationButtonAction = this.f243162a;
            if (navigationButtonAction == null) {
                return 0;
            }
            return navigationButtonAction.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "DefaultSelected(navigationAction=" + this.f243162a + ')';
        }
    }

    /* compiled from: CardSelectSlotItemPresenter.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/slots/card_select/item/k$d;", "Lcom/avito/android/publish/slots/card_select/item/k;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d extends k {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final d f243163a = new d();

        public d() {
            super(null);
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 138294866;
        }

        @Y61.k
        public final String toString() {
            return "NothingSelected";
        }
    }

    public /* synthetic */ k(C42822w c42822w) {
        this();
    }

    public k() {
    }
}
