package com.avito.android.beduin.common.component.file_uploader.validation;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.file_uploader.ValidationRule;
import com.avito.android.beduin.common.component.file_uploader.validation.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: FileValidator.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_beduin_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b {

    /* compiled from: FileValidator.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ int f101337l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ ValidationRule.b f101338m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i12, ValidationRule.b bVar) {
            super(0);
            this.f101337l = i12;
            this.f101338m = bVar;
        }

        @Override // Y41.a
        public final Boolean invoke() {
            return Boolean.valueOf(this.f101337l <= ((ValidationRule.MaxFilesCountRule) this.f101338m).getValue());
        }
    }

    /* compiled from: FileValidator.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.component.file_uploader.validation.b$b, reason: collision with other inner class name */
    public static final class C3036b extends N implements Y41.a<Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ int f101339l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ ValidationRule.b f101340m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3036b(int i12, ValidationRule.b bVar) {
            super(0);
            this.f101339l = i12;
            this.f101340m = bVar;
        }

        @Override // Y41.a
        public final Boolean invoke() {
            return Boolean.valueOf(this.f101339l >= ((ValidationRule.MinFilesCountRule) this.f101340m).getValue());
        }
    }

    /* compiled from: FileValidator.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.a<Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ int f101341l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i12) {
            super(0);
            this.f101341l = i12;
        }

        @Override // Y41.a
        public final Boolean invoke() {
            return Boolean.valueOf(this.f101341l == 0);
        }
    }

    /* compiled from: FileValidator.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends N implements Y41.a<Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ int f101342l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i12) {
            super(0);
            this.f101342l = i12;
        }

        @Override // Y41.a
        public final Boolean invoke() {
            return Boolean.valueOf(this.f101342l == 0);
        }
    }

    /* compiled from: FileValidator.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class e extends N implements Y41.a<Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.beduin.common.component.file_uploader.validation.a f101343l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ ValidationRule.MaxFileSizeRule f101344m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(com.avito.android.beduin.common.component.file_uploader.validation.a aVar, ValidationRule.MaxFileSizeRule maxFileSizeRule) {
            super(0);
            this.f101343l = aVar;
            this.f101344m = maxFileSizeRule;
        }

        @Override // Y41.a
        public final Boolean invoke() {
            return Boolean.valueOf(this.f101343l.f101334c <= ((long) this.f101344m.getValue()));
        }
    }

    /* compiled from: FileValidator.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class f extends N implements Y41.a<Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ ValidationRule.FileTypesRule f101345l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.beduin.common.component.file_uploader.validation.a f101346m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ValidationRule.FileTypesRule fileTypesRule, com.avito.android.beduin.common.component.file_uploader.validation.a aVar) {
            super(0);
            this.f101345l = fileTypesRule;
            this.f101346m = aVar;
        }

        @Override // Y41.a
        public final Boolean invoke() {
            return Boolean.valueOf(this.f101345l.c().contains(this.f101346m.f101336e));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final com.avito.android.beduin.common.component.file_uploader.validation.c a(int i12, ValidationRule.b bVar) {
        if (bVar instanceof ValidationRule.MaxFilesCountRule) {
            return b((ValidationRule) bVar, new a(i12, bVar));
        }
        if (bVar instanceof ValidationRule.MinFilesCountRule) {
            return b((ValidationRule) bVar, new C3036b(i12, bVar));
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final com.avito.android.beduin.common.component.file_uploader.validation.c b(ValidationRule validationRule, Y41.a<Boolean> aVar) {
        return aVar.invoke().booleanValue() ? c.C3037c.f101350b : new c.b(validationRule.getMessage());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006d  */
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.avito.android.beduin.common.component.file_uploader.validation.c c(@Y61.l java.util.List<? extends com.avito.android.beduin.common.component.file_uploader.ValidationRule> r6, @Y61.l java.util.List<com.avito.android.beduin.common.component.file_uploader.file.FileItem> r7) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.beduin.common.component.file_uploader.validation.b.c(java.util.List, java.util.List):com.avito.android.beduin.common.component.file_uploader.validation.c");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @k
    public static final com.avito.android.beduin.common.component.file_uploader.validation.c d(@l List<? extends ValidationRule> list, @k com.avito.android.beduin.common.component.file_uploader.validation.a aVar, int i12) {
        com.avito.android.beduin.common.component.file_uploader.validation.c cVarA;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (!(((ValidationRule) obj) instanceof ValidationRule.MinFilesCountRule)) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ValidationRule validationRule = (ValidationRule) it.next();
                if (validationRule instanceof ValidationRule.MaxFileSizeRule) {
                    cVarA = b(validationRule, new e(aVar, (ValidationRule.MaxFileSizeRule) validationRule));
                } else if (validationRule instanceof ValidationRule.FileTypesRule) {
                    cVarA = b(validationRule, new f((ValidationRule.FileTypesRule) validationRule, aVar));
                } else if (validationRule instanceof ValidationRule.b) {
                    cVarA = a(i12, (ValidationRule.b) validationRule);
                } else {
                    if (!(validationRule instanceof ValidationRule.UploadingFilesRule) && !(validationRule instanceof ValidationRule.DeletingFilesRule)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    cVarA = c.C3037c.f101350b;
                }
                com.avito.android.beduin.common.component.file_uploader.validation.c.f101347a.getClass();
                if (cVarA instanceof c.b) {
                    return cVarA;
                }
            }
        }
        return c.C3037c.f101350b;
    }
}
