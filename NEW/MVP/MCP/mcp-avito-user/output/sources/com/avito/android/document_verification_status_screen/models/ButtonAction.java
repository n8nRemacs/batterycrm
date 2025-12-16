package com.avito.android.document_verification_status_screen.models;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;
import kotlin.jvm.internal.L;

/* compiled from: ButtonAction.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/document_verification_status_screen/models/ButtonAction;", "", "Type", "_avito_gig_document-verification-status-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ButtonAction {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f144829a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Type f144830b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final DeepLink f144831c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f144832d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ButtonAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/document_verification_status_screen/models/ButtonAction$Type;", "", "_avito_gig_document-verification-status-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Type {

        /* renamed from: b, reason: collision with root package name */
        public static final Type f144833b;

        /* renamed from: c, reason: collision with root package name */
        public static final Type f144834c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ Type[] f144835d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ a f144836e;

        static {
            Type type = new Type("PRIMARY", 0);
            f144833b = type;
            Type type2 = new Type("SECONDARY", 1);
            f144834c = type2;
            Type[] typeArr = {type, type2};
            f144835d = typeArr;
            f144836e = c.a(typeArr);
        }

        public Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f144835d.clone();
        }
    }

    public ButtonAction(@k String str, @k Type type, @k DeepLink deepLink, @l String str2) {
        this.f144829a = str;
        this.f144830b = type;
        this.f144831c = deepLink;
        this.f144832d = str2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ButtonAction)) {
            return false;
        }
        ButtonAction buttonAction = (ButtonAction) obj;
        return L.f(this.f144829a, buttonAction.f144829a) && this.f144830b == buttonAction.f144830b && L.f(this.f144831c, buttonAction.f144831c) && L.f(this.f144832d, buttonAction.f144832d);
    }

    public final int hashCode() {
        int iE2 = com.avito.android.actions_sheet.a.e(this.f144831c, (this.f144830b.hashCode() + (this.f144829a.hashCode() * 31)) * 31, 31);
        String str = this.f144832d;
        return iE2 + (str == null ? 0 : str.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ButtonAction(title=");
        sb2.append(this.f144829a);
        sb2.append(", type=");
        sb2.append(this.f144830b);
        sb2.append(", deepLink=");
        sb2.append(this.f144831c);
        sb2.append(", name=");
        return C22026a.c(sb2, this.f144832d, ')');
    }
}
