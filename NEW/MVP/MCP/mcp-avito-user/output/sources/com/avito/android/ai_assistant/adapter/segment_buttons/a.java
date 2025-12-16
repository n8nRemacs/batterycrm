package com.avito.android.ai_assistant.adapter.segment_buttons;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.ai_assistant.adapter.i;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.conveyor_item.a;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SuggestButtonsItem.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/ai_assistant/adapter/segment_buttons/a;", "Lcom/avito/android/ai_assistant/adapter/a;", "Lcom/avito/android/ai_assistant/adapter/i;", "a", "b", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class a implements com.avito.android.ai_assistant.adapter.a, i {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f88848b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f88849c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f88850d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final DeepLink f88851e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final ArrayList f88852f;

    /* compiled from: SuggestButtonsItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ai_assistant/adapter/segment_buttons/a$a;", "", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.ai_assistant.adapter.segment_buttons.a$a, reason: collision with other inner class name */
    public static final /* data */ class C2619a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f88853a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f88854b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final ArrayList f88855c;

        public C2619a(@k String str, @l String str2, @k ArrayList arrayList) {
            this.f88853a = str;
            this.f88854b = str2;
            this.f88855c = arrayList;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2619a)) {
                return false;
            }
            C2619a c2619a = (C2619a) obj;
            return L.f(this.f88853a, c2619a.f88853a) && L.f(this.f88854b, c2619a.f88854b) && this.f88855c.equals(c2619a.f88855c);
        }

        public final int hashCode() {
            int iHashCode = this.f88853a.hashCode() * 31;
            String str = this.f88854b;
            return this.f88855c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Button(text=");
            sb2.append(this.f88853a);
            sb2.append(", style=");
            sb2.append(this.f88854b);
            sb2.append(", actions=");
            return androidx.compose.ui.graphics.colorspace.e.p(sb2, this.f88855c, ')');
        }
    }

    /* compiled from: SuggestButtonsItem.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/ai_assistant/adapter/segment_buttons/a$b;", "", "a", "b", "Lcom/avito/android/ai_assistant/adapter/segment_buttons/a$b$a;", "Lcom/avito/android/ai_assistant/adapter/segment_buttons/a$b$b;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {

        /* compiled from: SuggestButtonsItem.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ai_assistant/adapter/segment_buttons/a$b$a;", "Lcom/avito/android/ai_assistant/adapter/segment_buttons/a$b;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.ai_assistant.adapter.segment_buttons.a$b$a, reason: collision with other inner class name */
        public static final /* data */ class C2620a implements b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final DeepLink f88856a;

            public C2620a(@k DeepLink deepLink) {
                this.f88856a = deepLink;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2620a) && L.f(this.f88856a, ((C2620a) obj).f88856a);
            }

            public final int hashCode() {
                return this.f88856a.hashCode();
            }

            @k
            public final String toString() {
                return com.avito.android.actions_sheet.a.v(new StringBuilder("ClickStream(deepLink="), this.f88856a, ')');
            }
        }

        /* compiled from: SuggestButtonsItem.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ai_assistant/adapter/segment_buttons/a$b$b;", "Lcom/avito/android/ai_assistant/adapter/segment_buttons/a$b;", "_avito_ai-assistant_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.ai_assistant.adapter.segment_buttons.a$b$b, reason: collision with other inner class name */
        public static final /* data */ class C2621b implements b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String f88857a;

            public C2621b(@k String str) {
                this.f88857a = str;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2621b) && L.f(this.f88857a, ((C2621b) obj).f88857a);
            }

            public final int hashCode() {
                return this.f88857a.hashCode();
            }

            @k
            public final String toString() {
                return C22026a.c(new StringBuilder("Message(msg="), this.f88857a, ')');
            }
        }
    }

    public a(@l DeepLink deepLink, @k String str, @k String str2, @k String str3, @k ArrayList arrayList) {
        this.f88848b = str;
        this.f88849c = str2;
        this.f88850d = str3;
        this.f88851e = deepLink;
        this.f88852f = arrayList;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f88848b, aVar.f88848b) && L.f(this.f88849c, aVar.f88849c) && L.f(this.f88850d, aVar.f88850d) && L.f(this.f88851e, aVar.f88851e) && this.f88852f.equals(aVar.f88852f);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF83798f() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF88720b() {
        return this.f88848b;
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(this.f88848b.hashCode() * 31, 31, this.f88849c), 31, this.f88850d);
        DeepLink deepLink = this.f88851e;
        return this.f88852f.hashCode() + ((iD2 + (deepLink == null ? 0 : deepLink.hashCode())) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SuggestButtonsItem(stringId=");
        sb2.append(this.f88848b);
        sb2.append(", ownerId=");
        sb2.append(this.f88849c);
        sb2.append(", baseButtonStyle=");
        sb2.append(this.f88850d);
        sb2.append(", onShowClickstreamDeeplink=");
        sb2.append(this.f88851e);
        sb2.append(", buttons=");
        return androidx.compose.ui.graphics.colorspace.e.p(sb2, this.f88852f, ')');
    }
}
