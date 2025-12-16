package com.avito.android.social.esia;

import Y41.l;
import android.content.Intent;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: EsiaAuthActivity.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "it", "Lkotlin/G0;", "invoke", "(Ljava/util/Map;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class d extends N implements l<Map<String, ? extends String>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ EsiaAuthActivity f284388l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(EsiaAuthActivity esiaAuthActivity) {
        super(1);
        this.f284388l = esiaAuthActivity;
    }

    @Override // Y41.l
    public final G0 invoke(Map<String, ? extends String> map) {
        Map<String, ? extends String> map2 = map;
        Intent intent = new Intent();
        intent.putExtra("esia_code", map2.get("code"));
        intent.putExtra("esia_state", map2.get(VoiceInfo.STATE));
        intent.putExtra("esia_error", map2.get("error"));
        intent.putExtra("esia_error_message", map2.get("error_description"));
        G0 g02 = G0.f406611a;
        EsiaAuthActivity esiaAuthActivity = this.f284388l;
        esiaAuthActivity.setResult(-1, intent);
        esiaAuthActivity.finish();
        return G0.f406611a;
    }
}
