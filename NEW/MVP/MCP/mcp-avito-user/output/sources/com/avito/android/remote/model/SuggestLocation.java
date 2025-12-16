package com.avito.android.remote.model;

import Y61.l;
import aW.InterfaceC19823a;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SuggestLocation.kt */
@InterfaceC19823a
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0015\u0016B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f¨\u0006\u0017"}, d2 = {"Lcom/avito/android/remote/model/SuggestLocation;", "", "id", "", "names", "Lcom/avito/android/remote/model/CaseText;", InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME, "Lcom/avito/android/remote/model/SuggestLocation$From;", "parent", "Lcom/avito/android/remote/model/SuggestLocation$Parent;", "suggestType", "(Ljava/lang/String;Lcom/avito/android/remote/model/CaseText;Lcom/avito/android/remote/model/SuggestLocation$From;Lcom/avito/android/remote/model/SuggestLocation$Parent;Ljava/lang/String;)V", "getFrom", "()Lcom/avito/android/remote/model/SuggestLocation$From;", "getId", "()Ljava/lang/String;", "getNames", "()Lcom/avito/android/remote/model/CaseText;", "getParent", "()Lcom/avito/android/remote/model/SuggestLocation$Parent;", "getSuggestType", "From", "Parent", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class SuggestLocation {

    @l
    private final From from;

    @l
    private final String id;

    @l
    private final CaseText names;

    @l
    private final Parent parent;

    @l
    private final String suggestType;

    /* compiled from: SuggestLocation.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/avito/android/remote/model/SuggestLocation$From;", "", "internalId", "", "name", "path", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getInternalId", "()Ljava/lang/String;", "getName", "getPath", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class From {

        @c("internal_id")
        @l
        private final String internalId;

        @c("name")
        @l
        private final String name;

        @c("path")
        @l
        private final String path;

        public From() {
            this(null, null, null, 7, null);
        }

        @l
        public final String getInternalId() {
            return this.internalId;
        }

        @l
        public final String getName() {
            return this.name;
        }

        @l
        public final String getPath() {
            return this.path;
        }

        public From(@l String str, @l String str2, @l String str3) {
            this.internalId = str;
            this.name = str2;
            this.path = str3;
        }

        public /* synthetic */ From(String str, String str2, String str3, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : str3);
        }
    }

    /* compiled from: SuggestLocation.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/remote/model/SuggestLocation$Parent;", "", "id", "", "names", "Lcom/avito/android/remote/model/CaseText;", "(Ljava/lang/String;Lcom/avito/android/remote/model/CaseText;)V", "getId", "()Ljava/lang/String;", "getNames", "()Lcom/avito/android/remote/model/CaseText;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Parent {

        @c("id")
        @l
        private final String id;

        @c("names")
        @l
        private final CaseText names;

        /* JADX WARN: Multi-variable type inference failed */
        public Parent() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        @l
        public final String getId() {
            return this.id;
        }

        @l
        public final CaseText getNames() {
            return this.names;
        }

        public Parent(@l String str, @l CaseText caseText) {
            this.id = str;
            this.names = caseText;
        }

        public /* synthetic */ Parent(String str, CaseText caseText, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : caseText);
        }
    }

    public SuggestLocation(@l String str, @l CaseText caseText, @l From from, @l Parent parent, @l String str2) {
        this.id = str;
        this.names = caseText;
        this.from = from;
        this.parent = parent;
        this.suggestType = str2;
    }

    @l
    public final From getFrom() {
        return this.from;
    }

    @l
    public final String getId() {
        return this.id;
    }

    @l
    public final CaseText getNames() {
        return this.names;
    }

    @l
    public final Parent getParent() {
        return this.parent;
    }

    @l
    public final String getSuggestType() {
        return this.suggestType;
    }
}
