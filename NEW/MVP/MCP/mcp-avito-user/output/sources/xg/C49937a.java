package xg;

import Lg.InterfaceC14392c;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.Intent;
import com.avito.android.avl.view.AvlPlayerActivity;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;

/* compiled from: AvlIntentFactoryImpl.kt */
@Singleton
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lxg/a;", "LLg/c;", "_avito_avl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: xg.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C49937a implements InterfaceC14392c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Context f442596a;

    @Inject
    public C49937a(@k Context context) {
        this.f442596a = context;
    }

    @Override // Lg.InterfaceC14392c
    @k
    public final Intent a(@k String str, @l String str2, @l String str3, @l String str4) {
        new AvlPlayerActivity.b();
        Intent intent = new Intent(this.f442596a, (Class<?>) AvlPlayerActivity.class);
        intent.putExtra("player_url", str);
        intent.putExtra("data_key", str2);
        intent.putExtra("item_id_key", str3);
        intent.putExtra("source_session_id_key", str4);
        return intent;
    }
}
