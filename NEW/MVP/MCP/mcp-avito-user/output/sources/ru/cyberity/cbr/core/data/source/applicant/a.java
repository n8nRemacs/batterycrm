package ru.cyberity.cbr.core.data.source.applicant;

import Y61.k;
import Y61.l;
import com.avito.android.publish.drafts.LocalPublishState;
import java.io.File;
import java.util.List;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.InterfaceC43160i;
import ru.cyberity.cbr.core.data.model.CBRMessage;
import ru.cyberity.cbr.core.data.model.DocumentType;
import ru.cyberity.cbr.core.data.model.IdentitySide;
import ru.cyberity.cbr.core.data.model.g;
import ru.cyberity.cbr.core.data.model.remote.e;
import ru.cyberity.cbr.core.data.source.applicant.remote.a0;
import ru.cyberity.cbr.core.data.source.applicant.remote.r;
import ru.cyberity.cbr.core.data.source.applicant.remote.t;
import ru.cyberity.cbr.core.data.source.applicant.remote.w;
import ru.cyberity.cbr.core.data.source.applicant.remote.x;
import ru.cyberity.cbr.core.data.source.applicant.remote.z;

/* compiled from: ApplicantDataSource.kt */
@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001Je\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u000f\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0014J\u001b\u0010\u000f\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0016J#\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u0017H\u0016¢\u0006\u0004\b\u000f\u0010\u001bJ?\u0010\u000f\u001a\u00020\u001f2\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\n2\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001dH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010 JM\u0010\u000f\u001a\u00020%2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010!\u001a\u0004\u0018\u00010\u00022\b\u0010\"\u001a\u0004\u0018\u00010\u00022\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u001d2\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001dH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010&J#\u0010\u000f\u001a\u00020)2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010(\u001a\u00020'H¦@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010*J+\u0010\u000f\u001a\u00020)2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\u00022\u0006\u0010,\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010-J\u001b\u00100\u001a\u00020/2\u0006\u0010.\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b0\u0010\u0016J\u001b\u0010\u000f\u001a\u00020/2\u0006\u00102\u001a\u000201H¦@ø\u0001\u0000¢\u0006\u0004\b\u000f\u00103J/\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00105\u001a\u000204H¦@ø\u0001\u0000¢\u0006\u0004\b\u000f\u00106J+\u00107\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b7\u0010\u0016J#\u0010\u000f\u001a\u0002092\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00105\u001a\u000208H¦@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010:J+\u0010\u000f\u001a\u0002092\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010;\u001a\u00020\u00022\u0006\u00105\u001a\u00020<H¦@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010=J\u001b\u0010?\u001a\u00020>2\u0006\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b?\u0010\u0016ø\u0001\u0001\u0082\u0002\n\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006@À\u0006\u0001"}, d2 = {"Lru/cyberity/cbr/core/data/source/applicant/a;", "", "", "applicantId", "country", "Ljava/io/File;", "file", "identityType", "Lru/cyberity/cbr/core/data/model/IdentitySide;", "side", "", "headers", "Lru/cyberity/cbr/core/data/model/DocumentType;", "idDocSetType", "Lru/cyberity/cbr/core/data/model/remote/k;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;Ljava/lang/String;Lru/cyberity/cbr/core/data/model/IdentitySide;Ljava/util/Map;Lru/cyberity/cbr/core/data/model/DocumentType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "imageId", "Lkotlin/G0;", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lru/cyberity/cbr/core/c;", "accessTokenProvider", "Lkotlinx/coroutines/flow/i;", "Lru/cyberity/cbr/core/data/model/CBRMessage$ServerMessage;", "(Lru/cyberity/cbr/core/c;)Lkotlinx/coroutines/flow/i;", LocalPublishState.FIELDS, "", "unsetFields", "Lru/cyberity/cbr/core/data/model/g$a;", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "email", "phone", "Lru/cyberity/cbr/core/data/model/remote/e;", "customFields", "Lru/cyberity/cbr/core/data/model/g;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lru/cyberity/cbr/core/data/source/applicant/remote/w;", "requestCode", "Lru/cyberity/cbr/core/data/source/applicant/remote/x;", "(Ljava/lang/String;Lru/cyberity/cbr/core/data/source/applicant/remote/w;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "verificationId", "code", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "questionnaireId", "Lru/cyberity/cbr/core/data/source/applicant/remote/t;", "f", "Lru/cyberity/cbr/core/data/source/applicant/remote/r;", "questionnaire", "(Lru/cyberity/cbr/core/data/source/applicant/remote/r;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "data", "(Ljava/lang/String;[BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "e", "Lru/cyberity/cbr/core/data/source/applicant/remote/b;", "Lru/cyberity/cbr/core/data/source/applicant/remote/a0;", "(Ljava/lang/String;Lru/cyberity/cbr/core/data/source/applicant/remote/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "confirmationId", "Lru/cyberity/cbr/core/data/source/applicant/remote/a;", "(Ljava/lang/String;Ljava/lang/String;Lru/cyberity/cbr/core/data/source/applicant/remote/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lru/cyberity/cbr/core/data/source/applicant/remote/z;", "d", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public interface a {
    @l
    default Object a(@k String str, int i12, @k Continuation<? super G0> continuation) {
        return a(this, str, i12, continuation);
    }

    @l
    Object a(@k String str, @k String str2, @k String str3, @k Continuation<? super x> continuation);

    @l
    Object a(@k String str, @k String str2, @k ru.cyberity.cbr.core.data.source.applicant.remote.a aVar, @k Continuation<? super a0> continuation);

    @l
    Object a(@k String str, @k ru.cyberity.cbr.core.data.source.applicant.remote.b bVar, @k Continuation<? super a0> continuation);

    @l
    Object a(@k String str, @k w wVar, @k Continuation<? super x> continuation);

    @l
    Object a(@k String str, @k byte[] bArr, @k Continuation<? super Map<String, ? extends Object>> continuation);

    @l
    Object a(@k r rVar, @k Continuation<? super t> continuation);

    @l
    Object d(@k String str, @k Continuation<? super z> continuation);

    @l
    Object e(@k String str, @k Continuation<? super Map<String, ? extends Object>> continuation);

    @l
    Object f(@k String str, @k Continuation<? super t> continuation);

    @l
    default Object a(@k String str, @k String str2, @k File file, @l String str3, @l IdentitySide identitySide, @k Map<String, String> map, @l DocumentType documentType, @k Continuation<? super ru.cyberity.cbr.core.data.model.remote.k> continuation) {
        return a(this, str, str2, file, str3, identitySide, map, documentType, continuation);
    }

    @l
    default Object a(@k String str, @l String str2, @l String str3, @k List<e> list, @l List<String> list2, @k Continuation<? super g> continuation) {
        return a(this, str, str2, str3, list, list2, continuation);
    }

    @l
    default Object a(@k String str, @k Map<String, ? extends Object> map, @l List<String> list, @k Continuation<? super g.a> continuation) {
        return a(this, str, map, list, continuation);
    }

    @l
    default Object a(@k String str, @k Continuation<? super Boolean> continuation) {
        return a(this, str, continuation);
    }

    static /* synthetic */ Object a(a aVar, String str, String str2, File file, String str3, IdentitySide identitySide, Map map, DocumentType documentType, Continuation continuation) {
        throw new UnsupportedOperationException();
    }

    static /* synthetic */ Object a(a aVar, String str, int i12, Continuation continuation) {
        throw new UnsupportedOperationException();
    }

    static /* synthetic */ Object a(a aVar, String str, Continuation continuation) {
        throw new UnsupportedOperationException();
    }

    @k
    default InterfaceC43160i<CBRMessage.ServerMessage> a(@k ru.cyberity.cbr.core.c<String> accessTokenProvider) {
        throw new UnsupportedOperationException();
    }

    static /* synthetic */ Object a(a aVar, String str, Map map, List list, Continuation continuation) {
        throw new UnsupportedOperationException();
    }

    static /* synthetic */ Object a(a aVar, String str, String str2, String str3, List list, List list2, Continuation continuation) {
        throw new UnsupportedOperationException();
    }
}
