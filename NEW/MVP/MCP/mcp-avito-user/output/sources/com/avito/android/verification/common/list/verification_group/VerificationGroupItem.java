package com.avito.android.verification.common.list.verification_group;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: VerificationGroupItem.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/verification/common/list/verification_group/VerificationGroupItem;", "Lcom/avito/conveyor_item/a;", "Status", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class VerificationGroupItem implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f323448b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f323449c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final AttributedText f323450d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Status f323451e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final DeepLink f323452f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final UniversalImage f323453g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VerificationGroupItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/verification/common/list/verification_group/VerificationGroupItem$Status;", "", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Status {

        /* renamed from: b, reason: collision with root package name */
        public static final Status f323454b;

        /* renamed from: c, reason: collision with root package name */
        public static final Status f323455c;

        /* renamed from: d, reason: collision with root package name */
        public static final Status f323456d;

        /* renamed from: e, reason: collision with root package name */
        public static final Status f323457e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ Status[] f323458f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f323459g;

        static {
            Status status = new Status("DEFAULT", 0);
            f323454b = status;
            Status status2 = new Status("PENDING", 1);
            f323455c = status2;
            Status status3 = new Status("SUCCESS", 2);
            f323456d = status3;
            Status status4 = new Status("ERROR", 3);
            f323457e = status4;
            Status[] statusArr = {status, status2, status3, status4};
            f323458f = statusArr;
            f323459g = kotlin.enums.c.a(statusArr);
        }

        public Status() {
            throw null;
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) f323458f.clone();
        }
    }

    public VerificationGroupItem(@k String str, @k String str2, @k AttributedText attributedText, @k Status status, @l DeepLink deepLink, @l UniversalImage universalImage) {
        this.f323448b = str;
        this.f323449c = str2;
        this.f323450d = attributedText;
        this.f323451e = status;
        this.f323452f = deepLink;
        this.f323453g = universalImage;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VerificationGroupItem)) {
            return false;
        }
        VerificationGroupItem verificationGroupItem = (VerificationGroupItem) obj;
        return L.f(this.f323448b, verificationGroupItem.f323448b) && L.f(this.f323449c, verificationGroupItem.f323449c) && L.f(this.f323450d, verificationGroupItem.f323450d) && this.f323451e == verificationGroupItem.f323451e && L.f(this.f323452f, verificationGroupItem.f323452f) && L.f(this.f323453g, verificationGroupItem.f323453g);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF80616b() {
        return getF294909b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF294909b() {
        return this.f323448b;
    }

    public final int hashCode() {
        int iHashCode = (this.f323451e.hashCode() + com.avito.android.actions_sheet.a.b(H.d(this.f323448b.hashCode() * 31, 31, this.f323449c), 31, this.f323450d)) * 31;
        DeepLink deepLink = this.f323452f;
        int iHashCode2 = (iHashCode + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        UniversalImage universalImage = this.f323453g;
        return iHashCode2 + (universalImage != null ? universalImage.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VerificationGroupItem(stringId=");
        sb2.append(this.f323448b);
        sb2.append(", title=");
        sb2.append(this.f323449c);
        sb2.append(", subtitle=");
        sb2.append(this.f323450d);
        sb2.append(", status=");
        sb2.append(this.f323451e);
        sb2.append(", action=");
        sb2.append(this.f323452f);
        sb2.append(", image=");
        return com.avito.android.advert.item.delivery_suggests.l.s(sb2, this.f323453g, ')');
    }
}
