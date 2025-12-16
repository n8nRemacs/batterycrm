package com.avito.android.cpx_promo.impl.network.response;

import Y61.l;
import androidx.compose.runtime.internal.P;
import com.google.gson.annotations.c;
import hs.C40975a;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: CpxPromoBidSelectorResponse.kt */
@P
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001aB9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/avito/android/cpx_promo/impl/network/response/CpxPromoBidSelectorResponse;", "", "Lhs/a;", "title", "", "subtitleAuto", "subtitleManual", "Lcom/avito/android/cpx_promo/impl/network/response/CpxPromoBidSelectorResponse$Type;", "selectedType", "", "isVisible", "<init>", "(Lhs/a;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/cpx_promo/impl/network/response/CpxPromoBidSelectorResponse$Type;Ljava/lang/Boolean;)V", "Lhs/a;", "d", "()Lhs/a;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "Lcom/avito/android/cpx_promo/impl/network/response/CpxPromoBidSelectorResponse$Type;", "a", "()Lcom/avito/android/cpx_promo/impl/network/response/CpxPromoBidSelectorResponse$Type;", "Ljava/lang/Boolean;", "e", "()Ljava/lang/Boolean;", "Type", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CpxPromoBidSelectorResponse {

    @c("isVisible")
    @l
    private final Boolean isVisible;

    @c("selectedType")
    @l
    private final Type selectedType;

    @c("subtitleAuto")
    @l
    private final String subtitleAuto;

    @c("subtitleManual")
    @l
    private final String subtitleManual;

    @c("title")
    @l
    private final C40975a title;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CpxPromoBidSelectorResponse.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/cpx_promo/impl/network/response/CpxPromoBidSelectorResponse$Type;", "", "(Ljava/lang/String;I)V", "AUTO", "MANUAL", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Type {

        @c("auto")
        public static final Type AUTO;

        @c("manual")
        public static final Type MANUAL;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Type[] f127246b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f127247c;

        static {
            Type type = new Type("AUTO", 0);
            AUTO = type;
            Type type2 = new Type("MANUAL", 1);
            MANUAL = type2;
            Type[] typeArr = {type, type2};
            f127246b = typeArr;
            f127247c = kotlin.enums.c.a(typeArr);
        }

        private Type(String str, int i12) {
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f127246b.clone();
        }
    }

    public CpxPromoBidSelectorResponse(@l C40975a c40975a, @l String str, @l String str2, @l Type type, @l Boolean bool) {
        this.title = c40975a;
        this.subtitleAuto = str;
        this.subtitleManual = str2;
        this.selectedType = type;
        this.isVisible = bool;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final Type getSelectedType() {
        return this.selectedType;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final String getSubtitleAuto() {
        return this.subtitleAuto;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getSubtitleManual() {
        return this.subtitleManual;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final C40975a getTitle() {
        return this.title;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final Boolean getIsVisible() {
        return this.isVisible;
    }
}
