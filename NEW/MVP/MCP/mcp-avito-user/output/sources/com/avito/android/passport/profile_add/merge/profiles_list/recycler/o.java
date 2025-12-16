package com.avito.android.passport.profile_add.merge.profiles_list.recycler;

import androidx.compose.runtime.internal.P;
import com.avito.conveyor_item.a;
import kotlin.Metadata;

/* compiled from: MergeAccountsProfileItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/profiles_list/recycler/o;", "Lcom/avito/android/passport/profile_add/merge/profiles_list/recycler/v;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class o implements v {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f213334b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final com.avito.android.image_loader.a f213335c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f213336d;

    public o(@Y61.l com.avito.android.image_loader.a aVar, @Y61.k String str) {
        this.f213334b = str;
        this.f213335c = aVar;
        this.f213336d = str;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF428153b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF213861c() {
        return this.f213336d;
    }
}
