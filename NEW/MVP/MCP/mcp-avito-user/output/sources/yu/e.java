package Yu;

import android.net.Uri;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: DeepLinkParsingScope.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "T", "", "cause", "", "invoke", "(Ljava/lang/Throwable;)Ljava/lang/Void;", "Ku/c", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class e extends N implements Y41.l {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Uri f19722l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f19723m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Uri uri, String str) {
        super(1);
        this.f19722l = uri;
        this.f19723m = str;
    }

    @Override // Y41.l
    public final Object invoke(Object obj) throws DeeplinkParsingError.WrongParameterValue {
        String string = this.f19722l.toString();
        DeeplinkParsingError.FieldConstraint.Json json = DeeplinkParsingError.FieldConstraint.Json.f133988d;
        throw new DeeplinkParsingError.WrongParameterValue(string, this.f19723m, json, (Throwable) obj);
    }
}
