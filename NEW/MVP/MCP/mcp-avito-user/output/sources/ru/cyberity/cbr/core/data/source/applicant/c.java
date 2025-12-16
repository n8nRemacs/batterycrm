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
import kotlin.coroutines.intrinsics.IntrinsicsKt;
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

/* compiled from: RealApplicantRepository.kt */
@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J_\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00062\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0013\u001a\u00020\u00172\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0018J\u001b\u0010\u0013\u001a\u00020\u00192\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u001aJ?\u0010\u0013\u001a\u00020\u001f2\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001b0\u000e2\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001dH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010 JM\u0010\u0013\u001a\u00020%2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010!\u001a\u0004\u0018\u00010\u00062\b\u0010\"\u001a\u0004\u0018\u00010\u00062\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u001d2\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001dH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010&J#\u0010\u0013\u001a\u00020)2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010(\u001a\u00020'H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010*J+\u0010\u0013\u001a\u00020)2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010-J\u001b\u00100\u001a\u00020/2\u0006\u0010.\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b0\u0010\u001aJ\u001b\u0010\u0013\u001a\u00020/2\u0006\u00102\u001a\u000201H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0013\u00103J/\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001b0\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u00105\u001a\u000204H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0013\u00106J+\u00107\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0018\u00010\u000e2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b7\u0010\u001aJ#\u0010\u0013\u001a\u0002092\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u00105\u001a\u000208H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010:J+\u0010\u0013\u001a\u0002092\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010;\u001a\u00020\u00062\u0006\u00105\u001a\u00020<H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010=J\u001b\u0010?\u001a\u00020>2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b?\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010@\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006A"}, d2 = {"Lru/cyberity/cbr/core/data/source/applicant/c;", "Lru/cyberity/cbr/core/data/source/applicant/b;", "Lru/cyberity/cbr/core/data/source/applicant/a;", "remote", "<init>", "(Lru/cyberity/cbr/core/data/source/applicant/a;)V", "", "applicantId", "country", "Ljava/io/File;", "file", "identityType", "Lru/cyberity/cbr/core/data/model/IdentitySide;", "side", "", "headers", "Lru/cyberity/cbr/core/data/model/DocumentType;", "idDocSetType", "Lru/cyberity/cbr/core/data/model/remote/k;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;Ljava/lang/String;Lru/cyberity/cbr/core/data/model/IdentitySide;Ljava/util/Map;Lru/cyberity/cbr/core/data/model/DocumentType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "imageId", "Lkotlin/G0;", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", LocalPublishState.FIELDS, "", "unsetFields", "Lru/cyberity/cbr/core/data/model/g$a;", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "email", "phone", "Lru/cyberity/cbr/core/data/model/remote/e;", "customFields", "Lru/cyberity/cbr/core/data/model/g;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lru/cyberity/cbr/core/data/source/applicant/remote/w;", "requestCode", "Lru/cyberity/cbr/core/data/source/applicant/remote/x;", "(Ljava/lang/String;Lru/cyberity/cbr/core/data/source/applicant/remote/w;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "verificationId", "code", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "questionnaireId", "Lru/cyberity/cbr/core/data/source/applicant/remote/t;", "f", "Lru/cyberity/cbr/core/data/source/applicant/remote/r;", "questionnaire", "(Lru/cyberity/cbr/core/data/source/applicant/remote/r;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "data", "(Ljava/lang/String;[BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "e", "Lru/cyberity/cbr/core/data/source/applicant/remote/b;", "Lru/cyberity/cbr/core/data/source/applicant/remote/a0;", "(Ljava/lang/String;Lru/cyberity/cbr/core/data/source/applicant/remote/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "confirmationId", "Lru/cyberity/cbr/core/data/source/applicant/remote/a;", "(Ljava/lang/String;Ljava/lang/String;Lru/cyberity/cbr/core/data/source/applicant/remote/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lru/cyberity/cbr/core/data/source/applicant/remote/z;", "d", "Lru/cyberity/cbr/core/data/source/applicant/a;", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @k
    private final a remote;

    public c(@k a aVar) {
        this.remote = aVar;
    }

    @Override // ru.cyberity.cbr.core.data.source.applicant.b
    @l
    public Object a(@k String str, @k String str2, @k File file, @l String str3, @l IdentitySide identitySide, @k Map<String, String> map, @l DocumentType documentType, @k Continuation<? super ru.cyberity.cbr.core.data.model.remote.k> continuation) {
        return this.remote.a(str, str2, file, str3, identitySide, map, documentType, continuation);
    }

    @Override // ru.cyberity.cbr.core.data.source.applicant.b
    @l
    public Object d(@k String str, @k Continuation<? super z> continuation) {
        return this.remote.d(str, continuation);
    }

    @Override // ru.cyberity.cbr.core.data.source.applicant.b
    @l
    public Object e(@k String str, @k Continuation<? super Map<String, ? extends Object>> continuation) {
        return this.remote.e(str, continuation);
    }

    @Override // ru.cyberity.cbr.core.data.source.applicant.b
    @l
    public Object f(@k String str, @k Continuation<? super t> continuation) {
        return this.remote.f(str, continuation);
    }

    @Override // ru.cyberity.cbr.core.data.source.applicant.b
    @l
    public Object a(@k String str, int i12, @k Continuation<? super G0> continuation) {
        Object objA = this.remote.a(str, i12, continuation);
        return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : G0.f406611a;
    }

    @Override // ru.cyberity.cbr.core.data.source.applicant.b
    @l
    public Object a(@k String str, @k Continuation<? super Boolean> continuation) {
        return this.remote.a(str, continuation);
    }

    @Override // ru.cyberity.cbr.core.data.source.applicant.b
    @l
    public Object a(@k String str, @k Map<String, ? extends Object> map, @l List<String> list, @k Continuation<? super g.a> continuation) {
        return this.remote.a(str, map, list, continuation);
    }

    @Override // ru.cyberity.cbr.core.data.source.applicant.b
    @l
    public Object a(@k String str, @l String str2, @l String str3, @k List<e> list, @l List<String> list2, @k Continuation<? super g> continuation) {
        return this.remote.a(str, str2, str3, list, list2, continuation);
    }

    @Override // ru.cyberity.cbr.core.data.source.applicant.b
    @l
    public Object a(@k String str, @k w wVar, @k Continuation<? super x> continuation) {
        return this.remote.a(str, wVar, continuation);
    }

    @Override // ru.cyberity.cbr.core.data.source.applicant.b
    @l
    public Object a(@k String str, @k String str2, @k String str3, @k Continuation<? super x> continuation) {
        return this.remote.a(str, str2, str3, continuation);
    }

    @Override // ru.cyberity.cbr.core.data.source.applicant.b
    @l
    public Object a(@k r rVar, @k Continuation<? super t> continuation) {
        return this.remote.a(rVar, continuation);
    }

    @Override // ru.cyberity.cbr.core.data.source.applicant.b
    @l
    public Object a(@k String str, @k byte[] bArr, @k Continuation<? super Map<String, ? extends Object>> continuation) {
        return this.remote.a(str, bArr, continuation);
    }

    @Override // ru.cyberity.cbr.core.data.source.applicant.b
    @l
    public Object a(@k String str, @k ru.cyberity.cbr.core.data.source.applicant.remote.b bVar, @k Continuation<? super a0> continuation) {
        return this.remote.a(str, bVar, continuation);
    }

    @Override // ru.cyberity.cbr.core.data.source.applicant.b
    @l
    public Object a(@k String str, @k String str2, @k ru.cyberity.cbr.core.data.source.applicant.remote.a aVar, @k Continuation<? super a0> continuation) {
        return this.remote.a(str, str2, aVar, continuation);
    }
}
