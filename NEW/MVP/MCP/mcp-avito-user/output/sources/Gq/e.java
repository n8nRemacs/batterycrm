package GQ;

import Y61.k;
import Y61.l;
import kotlin.Metadata;

/* compiled from: ShortCvSuccessScreenResponse.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u00002\u00020\u0001BE\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0013\u001a\u0004\b\u001f\u0010\u0015R\u001a\u0010\r\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0016\u001a\u0004\b \u0010\u0018¨\u0006!"}, d2 = {"LGQ/e;", "", "LGQ/b;", "closeButton", "LGQ/a;", "closeEvent", "", "description", "LGQ/c;", "enrichCvButton", "LGQ/d;", "imageLink", "showEvent", "title", "<init>", "(LGQ/b;LGQ/a;Ljava/lang/String;LGQ/c;LGQ/d;LGQ/a;Ljava/lang/String;)V", "LGQ/b;", "a", "()LGQ/b;", "LGQ/a;", "getCloseEvent", "()LGQ/a;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "LGQ/c;", "c", "()LGQ/c;", "LGQ/d;", "d", "()LGQ/d;", "getShowEvent", "e", "_avito_job_success-screen-after-apply_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class e {

    @com.google.gson.annotations.c("closeButton")
    @l
    private final b closeButton;

    @com.google.gson.annotations.c("closeEvent")
    @l
    private final a closeEvent;

    @com.google.gson.annotations.c("description")
    @k
    private final String description;

    @com.google.gson.annotations.c("enrichCvButton")
    @k
    private final c enrichCvButton;

    @com.google.gson.annotations.c("imageLink")
    @k
    private final d imageLink;

    @com.google.gson.annotations.c("showEvent")
    @l
    private final a showEvent;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    public e(@l b bVar, @l a aVar, @k String str, @k c cVar, @k d dVar, @l a aVar2, @k String str2) {
        this.closeButton = bVar;
        this.closeEvent = aVar;
        this.description = str;
        this.enrichCvButton = cVar;
        this.imageLink = dVar;
        this.showEvent = aVar2;
        this.title = str2;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final b getCloseButton() {
        return this.closeButton;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final c getEnrichCvButton() {
        return this.enrichCvButton;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final d getImageLink() {
        return this.imageLink;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
