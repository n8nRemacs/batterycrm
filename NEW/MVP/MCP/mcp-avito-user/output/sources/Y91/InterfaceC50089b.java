package y91;

import J81.f;
import J81.o;
import J81.q;
import J81.s;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import okhttp3.MultipartBody;
import retrofit2.y;
import ru.mts.biometry.api.entity.SelectDocumentBody;
import ru.mts.biometry.api.entity.state.RecognitionStateResponse;

/* compiled from: RecognitionApi.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\u0007\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0007\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0004H§@¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004H§@¢\u0006\u0004\b\n\u0010\tJ\u001a\u0010\r\u001a\u00020\u00042\b\b\u0001\u0010\f\u001a\u00020\u000bH§@¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH§@¢\u0006\u0004\b\u0011\u0010\tJ\u0010\u0010\u0012\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0012\u0010\tJ0\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u000e\b\u0001\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H§@¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Ly91/b;", "", "", "pageId", "Lkotlin/G0;", "e", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "h", "d", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "f", "Lru/mts/biometry/api/entity/SelectDocumentBody;", "body", "a", "(Lru/mts/biometry/api/entity/SelectDocumentBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lretrofit2/y;", "Lru/mts/biometry/api/entity/state/RecognitionStateResponse;", "c", "g", "", "Lokhttp3/MultipartBody$Part;", "file", "b", "(Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: y91.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public interface InterfaceC50089b {
    @o("select-document-type")
    @l
    Object a(@J81.a @k SelectDocumentBody selectDocumentBody, @k Continuation<? super G0> continuation);

    @o("document-pages/{pageId}/collect-photos")
    @l
    @J81.l
    Object b(@s("pageId") @k String str, @q @k List<MultipartBody.Part> list, @k Continuation<? super y<G0>> continuation);

    @f(VoiceInfo.STATE)
    @l
    Object c(@k Continuation<? super y<RecognitionStateResponse>> continuation);

    @o("proceed-retry-recognition")
    @l
    Object d(@k Continuation<? super G0> continuation);

    @o("document-pages/{pageId}/proceed-confirmation")
    @l
    Object e(@s("pageId") @k String str, @k Continuation<? super G0> continuation);

    @o("proceed-document-onboarding")
    @l
    Object f(@k Continuation<? super G0> continuation);

    @o("proceed-retry-document")
    @l
    Object g(@k Continuation<? super G0> continuation);

    @o("document-pages/{pageId}/proceed-retry-photos-collection")
    @l
    Object h(@s("pageId") @k String str, @k Continuation<? super G0> continuation);
}
