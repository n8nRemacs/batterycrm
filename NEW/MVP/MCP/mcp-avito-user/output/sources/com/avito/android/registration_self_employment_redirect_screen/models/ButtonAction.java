package com.avito.android.registration_self_employment_redirect_screen.models;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;
import kotlin.jvm.internal.L;

/* compiled from: ButtonAction.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/registration_self_employment_redirect_screen/models/ButtonAction;", "", "Type", "_avito_gig_registration-self-employment-redirect-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class ButtonAction {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f252734a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Type f252735b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final DeepLink f252736c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ButtonAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/registration_self_employment_redirect_screen/models/ButtonAction$Type;", "", "_avito_gig_registration-self-employment-redirect-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Type {

        /* renamed from: b, reason: collision with root package name */
        public static final Type f252737b;

        /* renamed from: c, reason: collision with root package name */
        public static final Type f252738c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ Type[] f252739d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ a f252740e;

        static {
            Type type = new Type("PRIMARY", 0);
            f252737b = type;
            Type type2 = new Type("SECONDARY", 1);
            f252738c = type2;
            Type[] typeArr = {type, type2};
            f252739d = typeArr;
            f252740e = c.a(typeArr);
        }

        public Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f252739d.clone();
        }
    }

    public ButtonAction(@k String str, @k Type type, @k DeepLink deepLink) {
        this.f252734a = str;
        this.f252735b = type;
        this.f252736c = deepLink;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ButtonAction)) {
            return false;
        }
        ButtonAction buttonAction = (ButtonAction) obj;
        return L.f(this.f252734a, buttonAction.f252734a) && this.f252735b == buttonAction.f252735b && L.f(this.f252736c, buttonAction.f252736c);
    }

    public final int hashCode() {
        return this.f252736c.hashCode() + ((this.f252735b.hashCode() + (this.f252734a.hashCode() * 31)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ButtonAction(title=");
        sb2.append(this.f252734a);
        sb2.append(", type=");
        sb2.append(this.f252735b);
        sb2.append(", deeplink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f252736c, ')');
    }
}
