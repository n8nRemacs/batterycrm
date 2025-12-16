package com.avito.android.personal_selections.mvi;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PersonalSelectionsFeatureParams.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/personal_selections/mvi/a;", "", "a", "_avito_personal-selections_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f215797a;

    /* compiled from: PersonalSelectionsFeatureParams.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/avito/android/personal_selections/mvi/a$a;", "", "<init>", "()V", "", "MY_ITEMS_FROM_PAGE", "Ljava/lang/String;", "PERSONAL_SELECTIONS_ACTION_KEY", "PERSONAL_SELECTIONS_ACTION_NEED_RELOAD", "PERSONAL_SELECTIONS_SCREEN_NAME", "_avito_personal-selections_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.personal_selections.mvi.a$a, reason: collision with other inner class name */
    public static final class C6470a {
        public /* synthetic */ C6470a(C42822w c42822w) {
            this();
        }

        public C6470a() {
        }
    }

    static {
        new C6470a(null);
    }

    public a(@Y61.k String str) {
        this.f215797a = str;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return L.f(this.f215797a, ((a) obj).f215797a);
        }
        return false;
    }

    public final int hashCode() {
        return (this.f215797a.hashCode() * 31) - 473143443;
    }

    @Y61.k
    public final String toString() {
        return AK.c.s(new StringBuilder("PersonalSelectionsFeatureParams(featureName="), this.f215797a, ", fromPage=my_items)");
    }
}
