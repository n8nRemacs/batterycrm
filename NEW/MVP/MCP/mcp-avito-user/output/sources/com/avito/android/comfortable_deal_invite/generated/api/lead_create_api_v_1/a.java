package com.avito.android.comfortable_deal_invite.generated.api.lead_create_api_v_1;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import yq.C50280a;

/* compiled from: LeadCreateApiV1Response.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/comfortable_deal_invite/generated/api/lead_create_api_v_1/a;", "", "a", "b", "c", "Lcom/avito/android/comfortable_deal_invite/generated/api/lead_create_api_v_1/a$a;", "Lcom/avito/android/comfortable_deal_invite/generated/api/lead_create_api_v_1/a$b;", "Lcom/avito/android/comfortable_deal_invite/generated/api/lead_create_api_v_1/a$c;", "_avito_comfortable-deal-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface a {

    /* compiled from: LeadCreateApiV1Response.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/comfortable_deal_invite/generated/api/lead_create_api_v_1/a$a;", "Lcom/avito/android/comfortable_deal_invite/generated/api/lead_create_api_v_1/a;", "", "ok", "<init>", "(Z)V", "Z", "a", "()Z", "_avito_comfortable-deal-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.comfortable_deal_invite.generated.api.lead_create_api_v_1.a$a, reason: collision with other inner class name */
    public static final /* data */ class C3692a implements a {

        @com.google.gson.annotations.c("ok")
        private final boolean ok;

        public C3692a(boolean z12) {
            this.ok = z12;
        }

        /* renamed from: a, reason: from getter */
        public final boolean getOk() {
            return this.ok;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C3692a) && this.ok == ((C3692a) obj).ok;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.ok);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("Ok(ok="), this.ok, ')');
        }
    }

    /* compiled from: LeadCreateApiV1Response.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/comfortable_deal_invite/generated/api/lead_create_api_v_1/a$b;", "Lcom/avito/android/comfortable_deal_invite/generated/api/lead_create_api_v_1/a;", "Lyq/a;", "wrongItem", "<init>", "(Lyq/a;)V", "Lyq/a;", "a", "()Lyq/a;", "_avito_comfortable-deal-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements a {

        @com.google.gson.annotations.c("wrong-item")
        @k
        private final C50280a wrongItem;

        public b(@k C50280a c50280a) {
            this.wrongItem = c50280a;
        }

        @k
        /* renamed from: a, reason: from getter */
        public final C50280a getWrongItem() {
            return this.wrongItem;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.wrongItem, ((b) obj).wrongItem);
        }

        public final int hashCode() {
            return this.wrongItem.hashCode();
        }

        @k
        public final String toString() {
            return "WrongItem(wrongItem=" + this.wrongItem + ')';
        }
    }

    /* compiled from: LeadCreateApiV1Response.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/comfortable_deal_invite/generated/api/lead_create_api_v_1/a$c;", "Lcom/avito/android/comfortable_deal_invite/generated/api/lead_create_api_v_1/a;", "Lyq/a;", "wrongLiquidity", "<init>", "(Lyq/a;)V", "Lyq/a;", "a", "()Lyq/a;", "_avito_comfortable-deal-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements a {

        @com.google.gson.annotations.c("wrong-liquidity")
        @k
        private final C50280a wrongLiquidity;

        public c(@k C50280a c50280a) {
            this.wrongLiquidity = c50280a;
        }

        @k
        /* renamed from: a, reason: from getter */
        public final C50280a getWrongLiquidity() {
            return this.wrongLiquidity;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.wrongLiquidity, ((c) obj).wrongLiquidity);
        }

        public final int hashCode() {
            return this.wrongLiquidity.hashCode();
        }

        @k
        public final String toString() {
            return "WrongLiquidity(wrongLiquidity=" + this.wrongLiquidity + ')';
        }
    }
}
