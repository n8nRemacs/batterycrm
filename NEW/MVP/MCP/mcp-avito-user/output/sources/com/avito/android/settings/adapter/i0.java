package com.avito.android.settings.adapter;

import androidx.compose.runtime.C22026a;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SettingsItem.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/avito/android/settings/adapter/i0;", "Lcom/avito/conveyor_item/a;", "a", "c", "d", "e", "f", "g", "h", "i", "Lcom/avito/android/settings/adapter/i0$a;", "Lcom/avito/android/settings/adapter/i0$c;", "Lcom/avito/android/settings/adapter/i0$d;", "Lcom/avito/android/settings/adapter/i0$e;", "Lcom/avito/android/settings/adapter/i0$f;", "Lcom/avito/android/settings/adapter/i0$g;", "Lcom/avito/android/settings/adapter/i0$h;", "Lcom/avito/android/settings/adapter/i0$i;", "_avito_settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface i0 extends com.avito.conveyor_item.a {

    /* compiled from: SettingsItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/settings/adapter/i0$a;", "Lcom/avito/android/settings/adapter/i0;", "_avito_settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements i0 {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f280785b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f280786c;

        public a(@Y61.k String str, @Y61.k String str2) {
            this.f280785b = str;
            this.f280786c = str2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.L.f(this.f280785b, aVar.f280785b) && kotlin.jvm.internal.L.f(this.f280786c, aVar.f280786c);
        }

        @Override // TV0.a
        /* renamed from: getId */
        public final long getF272437b() {
            return a.C10492a.a(this);
        }

        @Override // com.avito.conveyor_item.a
        @Y61.k
        /* renamed from: getStringId, reason: from getter */
        public final String getF429411b() {
            return this.f280785b;
        }

        public final int hashCode() {
            return this.f280786c.hashCode() + (this.f280785b.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Category(stringId=");
            sb2.append(this.f280785b);
            sb2.append(", title=");
            return C22026a.c(sb2, this.f280786c, ')');
        }
    }

    /* compiled from: SettingsItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b {
    }

    /* compiled from: SettingsItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/settings/adapter/i0$c;", "Lcom/avito/android/settings/adapter/i0;", "_avito_settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements i0 {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f280787b;

        public c(@Y61.k String str) {
            this.f280787b = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && kotlin.jvm.internal.L.f(this.f280787b, ((c) obj).f280787b);
        }

        @Override // TV0.a
        /* renamed from: getId */
        public final long getF272437b() {
            return a.C10492a.a(this);
        }

        @Override // com.avito.conveyor_item.a
        @Y61.k
        /* renamed from: getStringId, reason: from getter */
        public final String getF429411b() {
            return this.f280787b;
        }

        public final int hashCode() {
            return this.f280787b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("Divider(stringId="), this.f280787b, ')');
        }
    }

    /* compiled from: SettingsItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/settings/adapter/i0$d;", "Lcom/avito/android/settings/adapter/i0;", "_avito_settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements i0 {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f280788b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f280789c;

        public d(@Y61.k String str, @Y61.k String str2) {
            this.f280788b = str;
            this.f280789c = str2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return kotlin.jvm.internal.L.f(this.f280788b, dVar.f280788b) && kotlin.jvm.internal.L.f(this.f280789c, dVar.f280789c);
        }

        @Override // TV0.a
        /* renamed from: getId */
        public final long getF272437b() {
            return a.C10492a.a(this);
        }

        @Override // com.avito.conveyor_item.a
        @Y61.k
        /* renamed from: getStringId, reason: from getter */
        public final String getF429411b() {
            return this.f280788b;
        }

        public final int hashCode() {
            return this.f280789c.hashCode() + (this.f280788b.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Info(stringId=");
            sb2.append(this.f280788b);
            sb2.append(", title=");
            return C22026a.c(sb2, this.f280789c, ')');
        }
    }

    /* compiled from: SettingsItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/settings/adapter/i0$e;", "Lcom/avito/android/settings/adapter/i0;", "_avito_settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements i0 {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f280790b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f280791c;

        public e(@Y61.k String str, boolean z12) {
            this.f280790b = str;
            this.f280791c = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            eVar.getClass();
            return kotlin.jvm.internal.L.f(this.f280790b, eVar.f280790b) && this.f280791c == eVar.f280791c;
        }

        @Override // TV0.a
        /* renamed from: getId */
        public final long getF272437b() {
            return a.C10492a.a(this);
        }

        @Override // com.avito.conveyor_item.a
        @Y61.k
        /* renamed from: getStringId */
        public final String getF429411b() {
            return "clearSearchHistory";
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f280791c) + androidx.compose.foundation.H.d(-1158002847, 31, this.f280790b);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("InfoWithProgress(stringId=clearSearchHistory, title=");
            sb2.append(this.f280790b);
            sb2.append(", showProgress=");
            return androidx.appcompat.app.r.x(sb2, this.f280791c, ')');
        }
    }

    /* compiled from: SettingsItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/settings/adapter/i0$f;", "Lcom/avito/android/settings/adapter/i0;", "_avito_settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements i0 {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f280792b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f280793c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f280794d;

        public f(@Y61.k String str, @Y61.k String str2, @Y61.k String str3) {
            this.f280792b = str;
            this.f280793c = str2;
            this.f280794d = str3;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return kotlin.jvm.internal.L.f(this.f280792b, fVar.f280792b) && kotlin.jvm.internal.L.f(this.f280793c, fVar.f280793c) && kotlin.jvm.internal.L.f(this.f280794d, fVar.f280794d);
        }

        @Override // TV0.a
        /* renamed from: getId */
        public final long getF272437b() {
            return a.C10492a.a(this);
        }

        @Override // com.avito.conveyor_item.a
        @Y61.k
        /* renamed from: getStringId, reason: from getter */
        public final String getF429411b() {
            return this.f280792b;
        }

        public final int hashCode() {
            return this.f280794d.hashCode() + androidx.compose.foundation.H.d(this.f280792b.hashCode() * 31, 31, this.f280793c);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ListItem(stringId=");
            sb2.append(this.f280792b);
            sb2.append(", title=");
            sb2.append(this.f280793c);
            sb2.append(", value=");
            return C22026a.c(sb2, this.f280794d, ')');
        }
    }

    /* compiled from: SettingsItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/settings/adapter/i0$g;", "Lcom/avito/android/settings/adapter/i0;", "_avito_settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g implements i0 {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f280795b;

        public g(@Y61.k String str) {
            this.f280795b = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            gVar.getClass();
            return kotlin.jvm.internal.L.f(this.f280795b, gVar.f280795b);
        }

        @Override // TV0.a
        /* renamed from: getId */
        public final long getF272437b() {
            return a.C10492a.a(this);
        }

        @Override // com.avito.conveyor_item.a
        @Y61.k
        /* renamed from: getStringId */
        public final String getF429411b() {
            return "logo";
        }

        public final int hashCode() {
            return this.f280795b.hashCode() + 1212581139;
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("LogoWithVersion(stringId=logo, versionId=version, version="), this.f280795b, ')');
        }
    }

    /* compiled from: SettingsItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/settings/adapter/i0$h;", "Lcom/avito/android/settings/adapter/i0;", "_avito_settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class h implements i0 {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.replace_main.toggle.d f280796b;

        public h(@Y61.k com.avito.android.replace_main.toggle.d dVar) {
            this.f280796b = dVar;
        }

        public static h a(h hVar, com.avito.android.replace_main.toggle.d dVar) {
            hVar.getClass();
            hVar.getClass();
            return new h(dVar);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            hVar.getClass();
            return kotlin.jvm.internal.L.f(this.f280796b, hVar.f280796b);
        }

        @Override // TV0.a
        /* renamed from: getId */
        public final long getF272437b() {
            return a.C10492a.a(this);
        }

        @Override // com.avito.conveyor_item.a
        @Y61.k
        /* renamed from: getStringId */
        public final String getF429411b() {
            return "replace_main";
        }

        public final int hashCode() {
            return this.f280796b.hashCode() + 1402662940;
        }

        @Y61.k
        public final String toString() {
            return "ReplaceMain(stringId=replace_main, replaceMainToggle=" + this.f280796b + ')';
        }
    }

    /* compiled from: SettingsItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/settings/adapter/i0$i;", "Lcom/avito/android/settings/adapter/i0;", "_avito_settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class i implements i0 {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f280797b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f280798c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final String f280799d;

        public i(@Y61.k String str, @Y61.k String str2, @Y61.l String str3) {
            this.f280797b = str;
            this.f280798c = str2;
            this.f280799d = str3;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return kotlin.jvm.internal.L.f(this.f280797b, iVar.f280797b) && kotlin.jvm.internal.L.f(this.f280798c, iVar.f280798c) && kotlin.jvm.internal.L.f(this.f280799d, iVar.f280799d);
        }

        @Override // TV0.a
        /* renamed from: getId */
        public final long getF272437b() {
            return a.C10492a.a(this);
        }

        @Override // com.avito.conveyor_item.a
        @Y61.k
        /* renamed from: getStringId, reason: from getter */
        public final String getF429411b() {
            return this.f280797b;
        }

        public final int hashCode() {
            int iD2 = androidx.compose.foundation.H.d(this.f280797b.hashCode() * 31, 31, this.f280798c);
            String str = this.f280799d;
            return iD2 + (str == null ? 0 : str.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Select(stringId=");
            sb2.append(this.f280797b);
            sb2.append(", title=");
            sb2.append(this.f280798c);
            sb2.append(", value=");
            return C22026a.c(sb2, this.f280799d, ')');
        }

        public /* synthetic */ i(String str, String str2, String str3, int i12, C42822w c42822w) {
            this(str, str2, (i12 & 4) != 0 ? null : str3);
        }
    }
}
