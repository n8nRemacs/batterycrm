package com.avito.android.rating_form;

import androidx.compose.foundation.H;
import com.avito.android.rating_form.api.remote.model.ButtonStyle;
import com.avito.android.rating_form.api.remote.model.RatingFormAddValueType;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RatingFormFieldsStorage.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/a;", "", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.rating_form.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final /* data */ class C34198a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f247939a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ButtonStyle f247940b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final List<RatingFormAddValueType.Command> f247941c;

    /* JADX WARN: Multi-variable type inference failed */
    public C34198a(@Y61.k String str, @Y61.k ButtonStyle buttonStyle, @Y61.k List<? extends RatingFormAddValueType.Command> list) {
        this.f247939a = str;
        this.f247940b = buttonStyle;
        this.f247941c = list;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34198a)) {
            return false;
        }
        C34198a c34198a = (C34198a) obj;
        return L.f(this.f247939a, c34198a.f247939a) && this.f247940b == c34198a.f247940b && L.f(this.f247941c, c34198a.f247941c);
    }

    public final int hashCode() {
        return this.f247941c.hashCode() + ((this.f247940b.hashCode() + (this.f247939a.hashCode() * 31)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ButtonHolder(title=");
        sb2.append(this.f247939a);
        sb2.append(", style=");
        sb2.append(this.f247940b);
        sb2.append(", commands=");
        return H.p(sb2, this.f247941c, ')');
    }
}
