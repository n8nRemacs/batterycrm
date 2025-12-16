package jT;

import J81.f;
import J81.i;
import J81.s;
import J81.u;
import Y61.k;
import Y61.l;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import okhttp3.ResponseBody;

/* compiled from: BeduinV2Api.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JP\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\u0014\b\u0001\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00062\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LjT/a;", "", "", "components", "beduinAgent", "path", "", "params", "scenariosKeys", "Lokhttp3/ResponseBody;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_design-modules_beduin-v2_network_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: jT.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public interface InterfaceC42305a {

    /* compiled from: BeduinV2Api.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jT.a$a, reason: collision with other inner class name */
    public static final class C11566a {
    }

    @f("{path}")
    @l
    Object a(@i("Beduin-Components") @k String str, @i("Beduin-Agent") @k String str2, @s(encoded = true, value = "path") @k String str3, @u(encoded = true) @k Map<String, String> map, @i("Beduin-Scenarios-Cache") @l String str4, @k Continuation<? super ResponseBody> continuation);
}
