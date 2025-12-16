package ru.cyberity.cbr.core.common;

import android.os.Parcelable;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import java.io.File;
import kotlin.Metadata;
import ru.cyberity.cbr.core.data.model.Document;

/* compiled from: CBRAppListener.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u0006\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\fJ\u0017\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000b\u0010\u000fJ\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u0006\u0010\u000fJ\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0006\u0010\u0012J#\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015H&¢\u0006\u0004\b\u0006\u0010\u0017J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0019J3\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u00022\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0006\u0010\u001fJ\u000f\u0010\u000b\u001a\u00020\u0005H&¢\u0006\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006 À\u0006\u0001"}, d2 = {"Lru/cyberity/cbr/core/common/g;", "", "", "requestKey", "documentType", "Lkotlin/G0;", "a", "(Ljava/lang/String;Ljava/lang/String;)V", "Lru/cyberity/cbr/core/data/model/Document;", "document", "(Lru/cyberity/cbr/core/data/model/Document;)V", "b", "()V", "Lru/cyberity/cbr/core/data/model/p;", "error", "(Lru/cyberity/cbr/core/data/model/p;)V", "", "show", "(Z)V", "Lru/cyberity/cbr/core/domain/model/c;", "introParams", "Landroid/os/Parcelable;", "payload", "(Lru/cyberity/cbr/core/domain/model/c;Landroid/os/Parcelable;)V", ContextActionHandler.Link.URL, "(Ljava/lang/String;)V", "Ljava/io/File;", "file", "", "rotation", "idDocSetType", "(Ljava/io/File;ILjava/lang/String;Ljava/lang/String;)V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public interface g {
    void a();

    void a(@Y61.k File file, int rotation, @Y61.k String idDocSetType, @Y61.l String requestKey);

    void a(@Y61.k String url);

    void a(@Y61.k String requestKey, @Y61.k String documentType);

    void a(@Y61.k Document document);

    void a(@Y61.k ru.cyberity.cbr.core.data.model.p error);

    void a(@Y61.k ru.cyberity.cbr.core.domain.model.c introParams, @Y61.l Parcelable payload);

    void a(boolean show);

    void b();

    void b(@Y61.k Document document);

    void b(@Y61.k ru.cyberity.cbr.core.data.model.p error);
}
