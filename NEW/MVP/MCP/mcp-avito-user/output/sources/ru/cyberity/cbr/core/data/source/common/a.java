package ru.cyberity.cbr.core.data.source.common;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import java.util.Locale;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.InterfaceC43160i;
import ru.cyberity.cbr.core.common.n0;
import ru.cyberity.cbr.core.data.model.CBRSDKState;
import ru.cyberity.cbr.core.data.model.g;

/* compiled from: CommonRepository.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J)\u0010\b\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H¦@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ#\u0010\b\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\rJ\u0017\u0010\b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\b\u0010\u0010J\u0013\u0010\u0012\u001a\u00020\u0011H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0014H¦@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0013J#\u0010\b\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H¦@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0018R\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\b\u0010\u0019\"\u0004\b\b\u0010\u001aR\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u001c8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eø\u0001\u0001\u0082\u0002\n\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006 À\u0006\u0001"}, d2 = {"Lru/cyberity/cbr/core/data/source/common/a;", "", "", "id", "", "force", "Lru/cyberity/cbr/core/data/model/g;", "Lru/cyberity/cbr/core/data/model/remote/response/ApplicantAction;", "a", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "applicantId", "language", "Lkotlin/G0;", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lru/cyberity/cbr/core/data/model/CBRSDKState;", VoiceInfo.STATE, "(Lru/cyberity/cbr/core/data/model/CBRSDKState;)V", "Ljava/util/Locale;", "c", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "applicant", "Lru/cyberity/cbr/core/data/model/b;", "agreement", "(Lru/cyberity/cbr/core/data/model/g;Lru/cyberity/cbr/core/data/model/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "()Ljava/lang/String;", "(Ljava/lang/String;)V", "selectedCountry", "Lkotlinx/coroutines/flow/i;", "b", "()Lkotlinx/coroutines/flow/i;", "sdkStateFlow", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public interface a {
    static /* synthetic */ Object a(a aVar, String str, boolean z12, Continuation continuation, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getActionById");
        }
        if ((i12 & 2) != 0) {
            z12 = false;
        }
        return aVar.a(str, z12, (Continuation<? super g>) continuation);
    }

    @l
    Object a(@k String str, @k String str2, @k Continuation<? super G0> continuation);

    @l
    Object a(@k String str, boolean z12, @k Continuation<? super g> continuation);

    @l
    Object a(@k Continuation<? super Map<String, ? extends Object>> continuation);

    @l
    Object a(@k g gVar, @k ru.cyberity.cbr.core.data.model.b bVar, @k Continuation<? super g> continuation);

    @l
    String a();

    void a(@l String str);

    void a(@k CBRSDKState state);

    @k
    InterfaceC43160i<CBRSDKState> b();

    @l
    default Object c(@k Continuation<? super Locale> continuation) {
        return a(this, continuation);
    }

    static /* synthetic */ Object a(a aVar, Continuation continuation) {
        return n0.f432787a.getLocale();
    }
}
